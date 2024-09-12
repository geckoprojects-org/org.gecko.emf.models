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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Describe Feature Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.DescribeFeatureTypeType#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link net.opengis.wfs.DescribeFeatureTypeType#getOutputFormat <em>Output Format</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getDescribeFeatureTypeType()
 * @model extendedMetaData="name='DescribeFeatureTypeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DescribeFeatureTypeType extends BaseRequestType {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.namespace.QName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute list.
	 * @see net.opengis.wfs.WFSPackage#getDescribeFeatureTypeType_TypeName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='element' name='TypeName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QName> getTypeName();

	/**
	 * Returns the value of the '<em><b>Output Format</b></em>' attribute.
	 * The default value is <code>"application/gml+xml; version=3.2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Format</em>' attribute.
	 * @see #isSetOutputFormat()
	 * @see #unsetOutputFormat()
	 * @see #setOutputFormat(String)
	 * @see net.opengis.wfs.WFSPackage#getDescribeFeatureTypeType_OutputFormat()
	 * @model default="application/gml+xml; version=3.2" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='outputFormat'"
	 * @generated
	 */
	String getOutputFormat();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.DescribeFeatureTypeType#getOutputFormat <em>Output Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Format</em>' attribute.
	 * @see #isSetOutputFormat()
	 * @see #unsetOutputFormat()
	 * @see #getOutputFormat()
	 * @generated
	 */
	void setOutputFormat(String value);

	/**
	 * Unsets the value of the '{@link net.opengis.wfs.DescribeFeatureTypeType#getOutputFormat <em>Output Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOutputFormat()
	 * @see #getOutputFormat()
	 * @see #setOutputFormat(String)
	 * @generated
	 */
	void unsetOutputFormat();

	/**
	 * Returns whether the value of the '{@link net.opengis.wfs.DescribeFeatureTypeType#getOutputFormat <em>Output Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Output Format</em>' attribute is set.
	 * @see #unsetOutputFormat()
	 * @see #getOutputFormat()
	 * @see #setOutputFormat(String)
	 * @generated
	 */
	boolean isSetOutputFormat();

} // DescribeFeatureTypeType
