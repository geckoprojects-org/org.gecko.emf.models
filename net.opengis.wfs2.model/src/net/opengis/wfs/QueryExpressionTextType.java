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

import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Expression Text Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.QueryExpressionTextType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.wfs.QueryExpressionTextType#getAny <em>Any</em>}</li>
 *   <li>{@link net.opengis.wfs.QueryExpressionTextType#getAny1 <em>Any1</em>}</li>
 *   <li>{@link net.opengis.wfs.QueryExpressionTextType#isIsPrivate <em>Is Private</em>}</li>
 *   <li>{@link net.opengis.wfs.QueryExpressionTextType#getLanguage <em>Language</em>}</li>
 *   <li>{@link net.opengis.wfs.QueryExpressionTextType#getReturnFeatureTypes <em>Return Feature Types</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getQueryExpressionTextType()
 * @model extendedMetaData="name='QueryExpressionTextType' kind='mixed'"
 * @generated
 */
@ProviderType
public interface QueryExpressionTextType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see net.opengis.wfs.WFSPackage#getQueryExpressionTextType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see net.opengis.wfs.WFSPackage#getQueryExpressionTextType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':1' processing='skip'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Any1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any1</em>' attribute list.
	 * @see net.opengis.wfs.WFSPackage#getQueryExpressionTextType_Any1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##targetNamespace' name=':2' processing='skip'"
	 * @generated
	 */
	FeatureMap getAny1();

	/**
	 * Returns the value of the '<em><b>Is Private</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Private</em>' attribute.
	 * @see #isSetIsPrivate()
	 * @see #unsetIsPrivate()
	 * @see #setIsPrivate(boolean)
	 * @see net.opengis.wfs.WFSPackage#getQueryExpressionTextType_IsPrivate()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isPrivate'"
	 * @generated
	 */
	boolean isIsPrivate();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.QueryExpressionTextType#isIsPrivate <em>Is Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Private</em>' attribute.
	 * @see #isSetIsPrivate()
	 * @see #unsetIsPrivate()
	 * @see #isIsPrivate()
	 * @generated
	 */
	void setIsPrivate(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.wfs.QueryExpressionTextType#isIsPrivate <em>Is Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsPrivate()
	 * @see #isIsPrivate()
	 * @see #setIsPrivate(boolean)
	 * @generated
	 */
	void unsetIsPrivate();

	/**
	 * Returns whether the value of the '{@link net.opengis.wfs.QueryExpressionTextType#isIsPrivate <em>Is Private</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Private</em>' attribute is set.
	 * @see #unsetIsPrivate()
	 * @see #isIsPrivate()
	 * @see #setIsPrivate(boolean)
	 * @generated
	 */
	boolean isSetIsPrivate();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see net.opengis.wfs.WFSPackage#getQueryExpressionTextType_Language()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='language'"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.QueryExpressionTextType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Return Feature Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Feature Types</em>' attribute.
	 * @see #setReturnFeatureTypes(List)
	 * @see net.opengis.wfs.WFSPackage#getQueryExpressionTextType_ReturnFeatureTypes()
	 * @model dataType="net.opengis.wfs.ReturnFeatureTypesListType" required="true" many="false"
	 *        extendedMetaData="kind='attribute' name='returnFeatureTypes'"
	 * @generated
	 */
	List<QName> getReturnFeatureTypes();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.QueryExpressionTextType#getReturnFeatureTypes <em>Return Feature Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Feature Types</em>' attribute.
	 * @see #getReturnFeatureTypes()
	 * @generated
	 */
	void setReturnFeatureTypes(List<QName> value);

} // QueryExpressionTextType
