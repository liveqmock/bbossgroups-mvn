/*
 *  Copyright 2008 biaoping.yin
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.frameworkset.spi.properties.interceptor;

import org.frameworkset.spi.BaseApplicationContext;
import org.frameworkset.spi.DefaultApplicationContext;
import org.junit.Test;


/**
 * <p>Title: ProInterceptorTest.java</p> 
 * <p>Description: </p>
 * <p>bboss workgroup</p>
 * <p>Copyright (c) 2007</p>
 * @Date 2010-1-28 下午10:27:59
 * @author biaoping.yin
 * @version 1.0
 */
public class ProInterceptorTest
{
	
	@Test
	public void testInterceptexecute() throws Exception
	{
		BaseApplicationContext context = DefaultApplicationContext.getApplicationContext("org/frameworkset/spi/properties/interceptor/interceptor.xml");
		AI a = (AI)context.getBeanObject("test.interceptorbean");
		a.test("duoduo");
	}
	
	@Test
	public void testInterceptMehodexecute() throws Exception
	{
		BaseApplicationContext context = DefaultApplicationContext.getApplicationContext("org/frameworkset/spi/properties/interceptor/interceptor.xml");
		AI a = (AI)context.getBeanObject("test.interceptorbeanmethod");
		a.test("duoduo");
		a.test("duoduo");
		a.notest("duoduo");
	}
	
	@Test
	public void testexecute() throws Exception
	{
		BaseApplicationContext context = DefaultApplicationContext.getApplicationContext("org/frameworkset/spi/properties/interceptor/interceptor.xml");
		AI a = (AI)context.getBeanObject("test.bean");
		a.test("duoduo");
	}
}
