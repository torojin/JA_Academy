package com.ja.aoptest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//Annotation 방식으로 로그를 만드는 방법
@Service
@Aspect
public class LogAdviceAnnotation {
	
	@Pointcut("execution(* com.ja.aoptest..*Impl.*(..))")
	public void allPointcut() {}
	
	@Pointcut("execution(* com.ja.aoptest..*Impl.*(..))")
	public void xxx() {}
	
	@Before("allPointcut()")
	public void printLog(JoinPoint jp) {
		System.out.println(jp.getSignature().getName()+"] 실행 전");
	}
}
