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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.UpdateType#getProperty <em>Property</em>}</li>
 *   <li>{@link net.opengis.wfs.UpdateType#getFilter <em>Filter</em>}</li>
 *   <li>{@link net.opengis.wfs.UpdateType#getInputFormat <em>Input Format</em>}</li>
 *   <li>{@link net.opengis.wfs.UpdateType#getSrsName <em>Srs Name</em>}</li>
 *   <li>{@link net.opengis.wfs.UpdateType#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getUpdateType()
 * @model extendedMetaData="name='UpdateType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UpdateType extends AbstractTransactionActionType {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wfs.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getUpdateType_Property()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PropertyType> getProperty();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterType)
	 * @see net.opengis.wfs.WFSPackage#getUpdateType_Filter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Filter' namespace='http://www.opengis.net/fes/2.0'"
	 * @generated
	 */
	FilterType getFilter();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.UpdateType#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Input Format</b></em>' attribute.
	 * The default value is <code>"application/gml+xml; version=3.2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Format</em>' attribute.
	 * @see #isSetInputFormat()
	 * @see #unsetInputFormat()
	 * @see #setInputFormat(String)
	 * @see net.opengis.wfs.WFSPackage#getUpdateType_InputFormat()
	 * @model default="application/gml+xml; version=3.2" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='inputFormat'"
	 * @generated
	 */
	String getInputFormat();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.UpdateType#getInputFormat <em>Input Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Format</em>' attribute.
	 * @see #isSetInputFormat()
	 * @see #unsetInputFormat()
	 * @see #getInputFormat()
	 * @generated
	 */
	void setInputFormat(String value);

	/**
	 * Unsets the value of the '{@link net.opengis.wfs.UpdateType#getInputFormat <em>Input Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInputFormat()
	 * @see #getInputFormat()
	 * @see #setInputFormat(String)
	 * @generated
	 */
	void unsetInputFormat();

	/**
	 * Returns whether the value of the '{@link net.opengis.wfs.UpdateType#getInputFormat <em>Input Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Input Format</em>' attribute is set.
	 * @see #unsetInputFormat()
	 * @see #getInputFormat()
	 * @see #setInputFormat(String)
	 * @generated
	 */
	boolean isSetInputFormat();

	/**
	 * Returns the value of the '<em><b>Srs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srs Name</em>' attribute.
	 * @see #setSrsName(String)
	 * @see net.opengis.wfs.WFSPackage#getUpdateType_SrsName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='srsName'"
	 * @generated
	 */
	String getSrsName();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.UpdateType#getSrsName <em>Srs Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srs Name</em>' attribute.
	 * @see #getSrsName()
	 * @generated
	 */
	void setSrsName(String value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(QName)
	 * @see net.opengis.wfs.WFSPackage#getUpdateType_TypeName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='typeName'"
	 * @generated
	 */
	QName getTypeName();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.UpdateType#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(QName value);

} // UpdateType
