package org.sonatype.tests.jetty.runner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;

/*
 * Copyright (c) 2010 Sonatype, Inc. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0, 
 * and you may not use this file except in compliance with the Apache License Version 2.0. 
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, 
 * software distributed under the Apache License Version 2.0 is distributed on an 
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */



/**
 * @author Benjamin Hanzelmann
 */
public abstract class DefaultSuiteConfiguration
    extends AbstractSuiteConfiguration
{

    @Override
    @Before
    public void before()
        throws Exception
    {
        super.before();
    }

    @Override
    @After
    public void after()
        throws Exception
    {
        super.after();
    }

    @AfterClass
    public static void afterClass()
        throws Exception
    {
        AbstractSuiteConfiguration.afterClass();

    }
}
