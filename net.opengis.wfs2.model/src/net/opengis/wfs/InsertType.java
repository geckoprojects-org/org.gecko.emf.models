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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.InsertType#getAny <em>Any</em>}</li>
 *   <li>{@link net.opengis.wfs.InsertType#getInputFormat <em>Input Format</em>}</li>
 *   <li>{@link net.opengis.wfs.InsertType#getSrsName <em>Srs Name</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getInsertType()
 * @model extendedMetaData="name='InsertType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface InsertType extends AbstractTransactionActionType {
	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see net.opengis.wfs.WFSPackage#getInsertType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':1' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Input Format</b></em>' attribute.
	 * The default value is <code>"application/gml+xml; version=3.2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Format</em>' attribute.
	 * @see #isSetInputFormat()
	 * @see #unsetInputFormat()
	 * @see #setInputFormat(String)
	 * @see net.opengis.wfs.WFSPackage#getInsertType_InputFormat()
	 * @model default="application/gml+xml; version=3.2" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='inputFormat'"
	 * @generated
	 */
	String getInputFormat();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.InsertType#getInputFormat <em>Input Format</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.wfs.InsertType#getInputFormat <em>Input Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInputFormat()
	 * @see #getInputFormat()
	 * @see #setInputFormat(String)
	 * @generated
	 */
	void unsetInputFormat();

	/**
	 * Returns whether the value of the '{@link net.opengis.wfs.InsertType#getInputFormat <em>Input Format</em>}' attribute is set.
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
	 * @see net.opengis.wfs.WFSPackage#getInsertType_SrsName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='srsName'"
	 * @generated
	 */
	String getSrsName();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.InsertType#getSrsName <em>Srs Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srs Name</em>' attribute.
	 * @see #getSrsName()
	 * @generated
	 */
	void setSrsName(String value);

} // InsertType
