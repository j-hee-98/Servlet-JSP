package ex0417.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SampleFilter implements Filter {

	public SampleFilter() {
		System.out.println("SampleFilter 생성자 호출....");
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("SampleFilter init call....");
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// 사전처리
		System.out.println("SampleFilter의 사전처리 중........");
		
		chain.doFilter(req, res);		// 다음 target 대상을 호출(filter or servlet or jsp)
		// 사후 처리
		System.out.println("SampleFilter의 사후처리 중.........");
	}
	
	@Override
	public void destroy() {
		System.out.println("SampleFilter destroy call....");
	}

}
