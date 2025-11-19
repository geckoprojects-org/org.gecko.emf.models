/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.open.oasis.docs.odata.ns.edm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TComplex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TComplexType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TComplexType#getProperty <em>Property</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TComplexType#getNavigationProperty <em>Navigation Property</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TComplexType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TComplexType#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TComplexType#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TComplexType#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TComplexType#isOpenType <em>Open Type</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTComplexType()
 * @model extendedMetaData="name='TComplexType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TComplexType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTComplexType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTComplexType_Property()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Property' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Navigation Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Property</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTComplexType_NavigationProperty()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NavigationProperty' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TNavigationProperty> getNavigationProperty();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTComplexType_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #setAbstract(boolean)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTComplexType_Abstract()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Abstract'"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TComplexType#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TComplexType#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAbstract()
	 * @see #isAbstract()
	 * @see #setAbstract(boolean)
	 * @generated
	 */
	void unsetAbstract();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.odata.ns.edm.TComplexType#isAbstract <em>Abstract</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Abstract</em>' attribute is set.
	 * @see #unsetAbstract()
	 * @see #isAbstract()
	 * @see #setAbstract(boolean)
	 * @generated
	 */
	boolean isSetAbstract();

	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' attribute.
	 * @see #setBaseType(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTComplexType_BaseType()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TQualifiedName"
	 *        extendedMetaData="kind='attribute' name='BaseType'"
	 * @generated
	 */
	String getBaseType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TComplexType#getBaseType <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' attribute.
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTComplexType_Name()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TSimpleIdentifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TComplexType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Open Type</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Type</em>' attribute.
	 * @see #isSetOpenType()
	 * @see #unsetOpenType()
	 * @see #setOpenType(boolean)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTComplexType_OpenType()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='OpenType'"
	 * @generated
	 */
	boolean isOpenType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TComplexType#isOpenType <em>Open Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Type</em>' attribute.
	 * @see #isSetOpenType()
	 * @see #unsetOpenType()
	 * @see #isOpenType()
	 * @generated
	 */
	void setOpenType(boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TComplexType#isOpenType <em>Open Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOpenType()
	 * @see #isOpenType()
	 * @see #setOpenType(boolean)
	 * @generated
	 */
	void unsetOpenType();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.odata.ns.edm.TComplexType#isOpenType <em>Open Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Open Type</em>' attribute is set.
	 * @see #unsetOpenType()
	 * @see #isOpenType()
	 * @see #setOpenType(boolean)
	 * @generated
	 */
	boolean isSetOpenType();

} // TComplexType
