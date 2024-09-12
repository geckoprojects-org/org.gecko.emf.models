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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.ActionType#getMessage <em>Message</em>}</li>
 *   <li>{@link net.opengis.wfs.ActionType#getCode <em>Code</em>}</li>
 *   <li>{@link net.opengis.wfs.ActionType#getLocator <em>Locator</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getActionType()
 * @model extendedMetaData="name='ActionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ActionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   If an action fails, the message element may be used
	 *                   to supply an exception message.
	 *                
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see net.opengis.wfs.WFSPackage#getActionType_Message()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Message' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.ActionType#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                The code attribute may be used to specify an 
	 *                exception code indicating why an action failed.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see net.opengis.wfs.WFSPackage#getActionType_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='code'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.ActionType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                The locator attribute is used to locate an action 
	 *                within a <Transaction> element.  The value
	 *                of the locator attribute is either a string that
	 *                is equal to the value of the handle attribute
	 *                specified on an  <Insert>, <Update>
	 *                or <Delete> action.  If a value is not 
	 *                specified for the handle attribute then a WFS 
	 *                may employ some other means of locating the 
	 *                action.  For example, the value of the locator
	 *                attribute may be an integer indicating the order
	 *                of the action (i.e. 1=First action, 2=Second action,
	 *                etc.).
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locator</em>' attribute.
	 * @see #setLocator(String)
	 * @see net.opengis.wfs.WFSPackage#getActionType_Locator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='locator'"
	 * @generated
	 */
	String getLocator();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.ActionType#getLocator <em>Locator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locator</em>' attribute.
	 * @see #getLocator()
	 * @generated
	 */
	void setLocator(String value);

} // ActionType
