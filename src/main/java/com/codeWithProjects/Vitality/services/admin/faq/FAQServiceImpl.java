package com.codeWithProjects.Vitality.services.admin.faq;

import com.codeWithProjects.Vitality.dto.FAQDto;
import com.codeWithProjects.Vitality.entity.FAQ;
import com.codeWithProjects.Vitality.entity.Product;
import com.codeWithProjects.Vitality.repository.FAQRepository;
import com.codeWithProjects.Vitality.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FAQServiceImpl implements FAQService{

    private final FAQRepository faqRepository;

    private final ProductRepository productRepository;

    public FAQDto postFAQ(Long productId, FAQDto faqDto){
        Optional<Product> optionalProduct = productRepository.findById(productId);
        if(optionalProduct.isPresent()){
            FAQ faq = new FAQ();

            faq.setQuestion(faqDto.getQuestion());
            faq.setAnswer(faqDto.getAnswer());
            faq.setProduct(optionalProduct.get());

            return faqRepository.save(faq).getFAQDto();
        }
        return null;
    }
}
