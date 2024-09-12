/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package net.opengis.wfs;

import net.opengis.ows.ExceptionReportType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Truncated Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.TruncatedResponseType#getExceptionReport <em>Exception Report</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getTruncatedResponseType()
 * @model extendedMetaData="name='truncatedResponse_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TruncatedResponseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Exception Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Report message returned to the client that requested any OWS operation when the server detects an error while processing that operation request. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception Report</em>' containment reference.
	 * @see #setExceptionReport(ExceptionReportType)
	 * @see net.opengis.wfs.WFSPackage#getTruncatedResponseType_ExceptionReport()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ExceptionReport' namespace='http://www.opengis.net/ows/1.1'"
	 * @generated
	 */
	ExceptionReportType getExceptionReport();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.TruncatedResponseType#getExceptionReport <em>Exception Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Report</em>' containment reference.
	 * @see #getExceptionReport()
	 * @generated
	 */
	void setExceptionReport(ExceptionReportType value);

} // TruncatedResponseType
