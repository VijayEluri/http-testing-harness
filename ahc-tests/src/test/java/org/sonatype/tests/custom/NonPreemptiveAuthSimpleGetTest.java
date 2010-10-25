package org.sonatype.tests.custom;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.sonatype.tests.jetty.runner.ConfigurationRunner;
import org.sonatype.tests.jetty.runner.ConfigurationRunner.ConfiguratorList;

import com.ning.http.client.AsyncHttpClient.BoundRequestBuilder;
import com.ning.http.client.AsyncHttpClientConfig.Builder;

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
 *
 */
@RunWith( ConfigurationRunner.class )
@ConfiguratorList( { "DefaultSuiteConfigurator.list", "AuthSuiteConfigurator.list" } )
public class NonPreemptiveAuthSimpleGetTest
    extends SimpleGetTest
{

    @Override
    @Before
    public void before()
        throws Exception
    {
        super.before();
        setAuthentication( "user", "password", false );
    }

    @Override
    protected Builder settings( Builder rb )
    {
        return super.settings( rb );
    }

    @Override
    protected BoundRequestBuilder requestSettings( BoundRequestBuilder rb )
    {
        return super.requestSettings( rb );
    }

    @Override
    @Test
    @Ignore( "Yields 401" )
    public void testTruncate()
        throws Exception
    {
        super.testTruncate();
    }

    @Override
    @Test
    // @Ignore( "Yields 401, credentials not sent to the redirect?" )
    public void testRedirect()
        throws Exception
    {
        super.testRedirect();
    }

}