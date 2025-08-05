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
package net.opengis.wms;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Person Primary Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.ContactPersonPrimaryType#getContactPerson <em>Contact Person</em>}</li>
 *   <li>{@link net.opengis.wms.ContactPersonPrimaryType#getContactOrganization <em>Contact Organization</em>}</li>
 * </ul>
 *
 * @see net.opengis.wms.WMSPackage#getContactPersonPrimaryType()
 * @model extendedMetaData="name='ContactPersonPrimary_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ContactPersonPrimaryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Contact Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Person</em>' attribute.
	 * @see #setContactPerson(String)
	 * @see net.opengis.wms.WMSPackage#getContactPersonPrimaryType_ContactPerson()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ContactPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContactPerson();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ContactPersonPrimaryType#getContactPerson <em>Contact Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Person</em>' attribute.
	 * @see #getContactPerson()
	 * @generated
	 */
	void setContactPerson(String value);

	/**
	 * Returns the value of the '<em><b>Contact Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Organization</em>' attribute.
	 * @see #setContactOrganization(String)
	 * @see net.opengis.wms.WMSPackage#getContactPersonPrimaryType_ContactOrganization()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ContactOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContactOrganization();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ContactPersonPrimaryType#getContactOrganization <em>Contact Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Organization</em>' attribute.
	 * @see #getContactOrganization()
	 * @generated
	 */
	void setContactOrganization(String value);

} // ContactPersonPrimaryType
