/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package net.opengis.ogc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Exception Report Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.ServiceExceptionReportType#getServiceException <em>Service Exception</em>}</li>
 *   <li>{@link net.opengis.ogc.ServiceExceptionReportType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.OGCExceptionsPackage#getServiceExceptionReportType()
 * @model extendedMetaData="name='ServiceExceptionReport_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ServiceExceptionReportType extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Exception</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ogc.ServiceExceptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Exception</em>' containment reference list.
	 * @see net.opengis.ogc.OGCExceptionsPackage#getServiceExceptionReportType_ServiceException()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ServiceException' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ServiceExceptionType> getServiceException();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1.3.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(String)
	 * @see net.opengis.ogc.OGCExceptionsPackage#getServiceExceptionReportType_Version()
	 * @model default="1.3.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.ServiceExceptionReportType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Unsets the value of the '{@link net.opengis.ogc.ServiceExceptionReportType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link net.opengis.ogc.ServiceExceptionReportType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	boolean isSetVersion();

} // ServiceExceptionReportType
