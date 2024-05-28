package com.codeWithProjects.Vitality.services.admin.faq;

import com.codeWithProjects.Vitality.dto.FAQDto;

public interface FAQService {

    FAQDto postFAQ(Long productId, FAQDto faqDto);
}
