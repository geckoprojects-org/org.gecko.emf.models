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
package org.emau.icmvc.ganimed.ttp.cm2;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Signer Id Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateSignerIdType#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateSignerIdType#getSignerIdTypeName <em>Signer Id Type Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateSignerIdType#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateSignerIdType#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateSignerIdType()
 * @model extendedMetaData="name='updateSignerIdType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UpdateSignerIdType extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateSignerIdType_DomainName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='domainName'"
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateSignerIdType#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Signer Id Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signer Id Type Name</em>' attribute.
	 * @see #setSignerIdTypeName(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateSignerIdType_SignerIdTypeName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='signerIdTypeName'"
	 * @generated
	 */
	String getSignerIdTypeName();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateSignerIdType#getSignerIdTypeName <em>Signer Id Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signer Id Type Name</em>' attribute.
	 * @see #getSignerIdTypeName()
	 * @generated
	 */
	void setSignerIdTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateSignerIdType_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='label'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateSignerIdType#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateSignerIdType_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateSignerIdType#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // UpdateSignerIdType
