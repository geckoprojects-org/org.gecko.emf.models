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

import javax.xml.namespace.QName;

import net.opengis.fes.FilterType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.DeleteType#getFilter <em>Filter</em>}</li>
 *   <li>{@link net.opengis.wfs.DeleteType#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getDeleteType()
 * @model extendedMetaData="name='DeleteType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeleteType extends AbstractTransactionActionType {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterType)
	 * @see net.opengis.wfs.WFSPackage#getDeleteType_Filter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Filter' namespace='http://www.opengis.net/fes/2.0'"
	 * @generated
	 */
	FilterType getFilter();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.DeleteType#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(QName)
	 * @see net.opengis.wfs.WFSPackage#getDeleteType_TypeName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='typeName'"
	 * @generated
	 */
	QName getTypeName();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.DeleteType#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(QName value);

} // DeleteType
