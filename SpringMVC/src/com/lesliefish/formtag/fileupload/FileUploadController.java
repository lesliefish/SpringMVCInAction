package com.lesliefish.formtag.fileupload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;

@Controller
public class FileUploadController {

    @Autowired
    ServletContext servletContext;

    @RequestMapping(value = "/fileUploadPage", method = RequestMethod.GET)
    public ModelAndView fileUploadPage() {
        return new ModelAndView("formtag_fileupload_uploadpage", "command", new FileModel());
    }

    @RequestMapping(value = "/fileUploadPage", method = RequestMethod.POST)
    public String fileUpload(@Validated FileModel fileModel, BindingResult bindingResult, ModelMap model) throws IOException {
        if (bindingResult.hasErrors()) {
            System.out.println("validation errors");
            return "formtag_fileupload_uploadpage";
        } else {
            System.out.println("Fetching file");
            MultipartFile file = fileModel.getFile();
            String uploadPath = servletContext.getRealPath("") + "temp" + File.separator;

            FileCopyUtils.copy(fileModel.getFile().getBytes(), new File(uploadPath + fileModel.getFile().getOriginalFilename()));
            String fileName = file.getOriginalFilename();
            model.addAttribute("fileName", fileName);
            return "formtag_fileupload_uploadpageresult";
        }
    }
}
