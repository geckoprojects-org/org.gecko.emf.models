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

import javax.xml.datatype.XMLGregorianCalendar;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signer Id DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO#getId <em>Id</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO#getIdType <em>Id Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO#getOrderNumber <em>Order Number</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getSignerIdDTO()
 * @model extendedMetaData="name='signerIdDTO' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SignerIdDTO extends FhirIdDTO {
	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getSignerIdDTO_CreationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='creationDate'"
	 * @generated
	 */
	XMLGregorianCalendar getCreationDate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getSignerIdDTO_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Id Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Type</em>' attribute.
	 * @see #setIdType(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getSignerIdDTO_IdType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='idType'"
	 * @generated
	 */
	String getIdType();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO#getIdType <em>Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Type</em>' attribute.
	 * @see #getIdType()
	 * @generated
	 */
	void setIdType(String value);

	/**
	 * Returns the value of the '<em><b>Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Number</em>' attribute.
	 * @see #isSetOrderNumber()
	 * @see #unsetOrderNumber()
	 * @see #setOrderNumber(int)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getSignerIdDTO_OrderNumber()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='orderNumber'"
	 * @generated
	 */
	int getOrderNumber();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO#getOrderNumber <em>Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Number</em>' attribute.
	 * @see #isSetOrderNumber()
	 * @see #unsetOrderNumber()
	 * @see #getOrderNumber()
	 * @generated
	 */
	void setOrderNumber(int value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO#getOrderNumber <em>Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrderNumber()
	 * @see #getOrderNumber()
	 * @see #setOrderNumber(int)
	 * @generated
	 */
	void unsetOrderNumber();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO#getOrderNumber <em>Order Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Order Number</em>' attribute is set.
	 * @see #unsetOrderNumber()
	 * @see #getOrderNumber()
	 * @see #setOrderNumber(int)
	 * @generated
	 */
	boolean isSetOrderNumber();

} // SignerIdDTO
