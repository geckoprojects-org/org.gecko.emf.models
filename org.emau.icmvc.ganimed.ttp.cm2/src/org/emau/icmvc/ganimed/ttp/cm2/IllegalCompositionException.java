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
 * A representation of the model object '<em><b>Illegal Composition Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.IllegalCompositionException#getIllegalItemType <em>Illegal Item Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.IllegalCompositionException#getIllegalItem <em>Illegal Item</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.IllegalCompositionException#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getIllegalCompositionException()
 * @model extendedMetaData="name='IllegalCompositionException' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface IllegalCompositionException extends EObject {
	/**
	 * Returns the value of the '<em><b>Illegal Item Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emau.icmvc.ganimed.ttp.cm2.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Illegal Item Type</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ItemType
	 * @see #isSetIllegalItemType()
	 * @see #unsetIllegalItemType()
	 * @see #setIllegalItemType(ItemType)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getIllegalCompositionException_IllegalItemType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='illegalItemType'"
	 * @generated
	 */
	ItemType getIllegalItemType();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.IllegalCompositionException#getIllegalItemType <em>Illegal Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Illegal Item Type</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ItemType
	 * @see #isSetIllegalItemType()
	 * @see #unsetIllegalItemType()
	 * @see #getIllegalItemType()
	 * @generated
	 */
	void setIllegalItemType(ItemType value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.IllegalCompositionException#getIllegalItemType <em>Illegal Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIllegalItemType()
	 * @see #getIllegalItemType()
	 * @see #setIllegalItemType(ItemType)
	 * @generated
	 */
	void unsetIllegalItemType();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.IllegalCompositionException#getIllegalItemType <em>Illegal Item Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Illegal Item Type</em>' attribute is set.
	 * @see #unsetIllegalItemType()
	 * @see #getIllegalItemType()
	 * @see #setIllegalItemType(ItemType)
	 * @generated
	 */
	boolean isSetIllegalItemType();

	/**
	 * Returns the value of the '<em><b>Illegal Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Illegal Item</em>' attribute.
	 * @see #setIllegalItem(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getIllegalCompositionException_IllegalItem()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='illegalItem'"
	 * @generated
	 */
	String getIllegalItem();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.IllegalCompositionException#getIllegalItem <em>Illegal Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Illegal Item</em>' attribute.
	 * @see #getIllegalItem()
	 * @generated
	 */
	void setIllegalItem(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getIllegalCompositionException_Message()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='message'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.IllegalCompositionException#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // IllegalCompositionException
