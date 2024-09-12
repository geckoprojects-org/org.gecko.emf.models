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
 * A representation of the model object '<em><b>Value Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.ValueReferenceType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.wfs.ValueReferenceType#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getValueReferenceType()
 * @model extendedMetaData="name='ValueReference_._type' kind='simple'"
 * @generated
 */
@ProviderType
public interface ValueReferenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see net.opengis.wfs.WFSPackage#getValueReferenceType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.ValueReferenceType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The default value is <code>"replace"</code>.
	 * The literals are from the enumeration {@link net.opengis.wfs.UpdateActionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see net.opengis.wfs.UpdateActionType
	 * @see #isSetAction()
	 * @see #unsetAction()
	 * @see #setAction(UpdateActionType)
	 * @see net.opengis.wfs.WFSPackage#getValueReferenceType_Action()
	 * @model default="replace" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='action'"
	 * @generated
	 */
	UpdateActionType getAction();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.ValueReferenceType#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see net.opengis.wfs.UpdateActionType
	 * @see #isSetAction()
	 * @see #unsetAction()
	 * @see #getAction()
	 * @generated
	 */
	void setAction(UpdateActionType value);

	/**
	 * Unsets the value of the '{@link net.opengis.wfs.ValueReferenceType#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAction()
	 * @see #getAction()
	 * @see #setAction(UpdateActionType)
	 * @generated
	 */
	void unsetAction();

	/**
	 * Returns whether the value of the '{@link net.opengis.wfs.ValueReferenceType#getAction <em>Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Action</em>' attribute is set.
	 * @see #unsetAction()
	 * @see #getAction()
	 * @see #setAction(UpdateActionType)
	 * @generated
	 */
	boolean isSetAction();

} // ValueReferenceType
