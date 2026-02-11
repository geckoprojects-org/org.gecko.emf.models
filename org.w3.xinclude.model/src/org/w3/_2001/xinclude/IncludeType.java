/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.w3._2001.xinclude;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001.xinclude.IncludeType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.IncludeType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.IncludeType#getFallback <em>Fallback</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.IncludeType#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.IncludeType#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.IncludeType#getAccept <em>Accept</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.IncludeType#getAcceptLanguage <em>Accept Language</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.IncludeType#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.IncludeType#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.IncludeType#getParse <em>Parse</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.IncludeType#getXpointer <em>Xpointer</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.IncludeType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.w3._2001.xinclude.IncludePackage#getIncludeType()
 * @model extendedMetaData="name='includeType' kind='mixed'"
 * @generated
 */
@ProviderType
public interface IncludeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.w3._2001.xinclude.IncludePackage#getIncludeType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.w3._2001.xinclude.IncludePackage#getIncludeType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Fallback</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2001.xinclude.FallbackType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fallback</em>' containment reference list.
	 * @see org.w3._2001.xinclude.IncludePackage#getIncludeType_Fallback()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fallback' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<FallbackType> getFallback();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.w3._2001.xinclude.IncludePackage#getIncludeType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax' group='#group:1'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Any1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any1</em>' attribute list.
	 * @see org.w3._2001.xinclude.IncludePackage#getIncludeType_Any1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##local' name=':4' processing='lax' group='#group:1'"
	 * @generated
	 */
	FeatureMap getAny1();

	/**
	 * Returns the value of the '<em><b>Accept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accept</em>' attribute.
	 * @see #setAccept(String)
	 * @see org.w3._2001.xinclude.IncludePackage#getIncludeType_Accept()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='accept'"
	 * @generated
	 */
	String getAccept();

	/**
	 * Sets the value of the '{@link org.w3._2001.xinclude.IncludeType#getAccept <em>Accept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept</em>' attribute.
	 * @see #getAccept()
	 * @generated
	 */
	void setAccept(String value);

	/**
	 * Returns the value of the '<em><b>Accept Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accept Language</em>' attribute.
	 * @see #setAcceptLanguage(String)
	 * @see org.w3._2001.xinclude.IncludePackage#getIncludeType_AcceptLanguage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='accept-language'"
	 * @generated
	 */
	String getAcceptLanguage();

	/**
	 * Sets the value of the '{@link org.w3._2001.xinclude.IncludeType#getAcceptLanguage <em>Accept Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept Language</em>' attribute.
	 * @see #getAcceptLanguage()
	 * @generated
	 */
	void setAcceptLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see org.w3._2001.xinclude.IncludePackage#getIncludeType_Encoding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.w3._2001.xinclude.IncludeType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.w3._2001.xinclude.IncludePackage#getIncludeType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.w3._2001.xinclude.IncludeType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Parse</b></em>' attribute.
	 * The default value is <code>"xml"</code>.
	 * The literals are from the enumeration {@link org.w3._2001.xinclude.ParseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parse</em>' attribute.
	 * @see org.w3._2001.xinclude.ParseType
	 * @see #isSetParse()
	 * @see #unsetParse()
	 * @see #setParse(ParseType)
	 * @see org.w3._2001.xinclude.IncludePackage#getIncludeType_Parse()
	 * @model default="xml" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='parse'"
	 * @generated
	 */
	ParseType getParse();

	/**
	 * Sets the value of the '{@link org.w3._2001.xinclude.IncludeType#getParse <em>Parse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parse</em>' attribute.
	 * @see org.w3._2001.xinclude.ParseType
	 * @see #isSetParse()
	 * @see #unsetParse()
	 * @see #getParse()
	 * @generated
	 */
	void setParse(ParseType value);

	/**
	 * Unsets the value of the '{@link org.w3._2001.xinclude.IncludeType#getParse <em>Parse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetParse()
	 * @see #getParse()
	 * @see #setParse(ParseType)
	 * @generated
	 */
	void unsetParse();

	/**
	 * Returns whether the value of the '{@link org.w3._2001.xinclude.IncludeType#getParse <em>Parse</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Parse</em>' attribute is set.
	 * @see #unsetParse()
	 * @see #getParse()
	 * @see #setParse(ParseType)
	 * @generated
	 */
	boolean isSetParse();

	/**
	 * Returns the value of the '<em><b>Xpointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xpointer</em>' attribute.
	 * @see #setXpointer(String)
	 * @see org.w3._2001.xinclude.IncludePackage#getIncludeType_Xpointer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='xpointer'"
	 * @generated
	 */
	String getXpointer();

	/**
	 * Sets the value of the '{@link org.w3._2001.xinclude.IncludeType#getXpointer <em>Xpointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpointer</em>' attribute.
	 * @see #getXpointer()
	 * @generated
	 */
	void setXpointer(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.w3._2001.xinclude.IncludePackage#getIncludeType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':11' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // IncludeType
