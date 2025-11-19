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
 * A representation of the model object '<em><b>TFunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TFunction#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TFunction#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TFunction#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TFunction#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TFunction#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TFunction#getAnnotation1 <em>Annotation1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TFunction#getEntitySetPath <em>Entity Set Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TFunction#isIsBound <em>Is Bound</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TFunction#isIsComposable <em>Is Composable</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TFunction#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTFunction()
 * @model extendedMetaData="name='TFunction' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTFunction_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTFunction_Parameter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Parameter' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TActionFunctionParameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTFunction_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(TActionFunctionReturnType)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTFunction_ReturnType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ReturnType' namespace='##targetNamespace'"
	 * @generated
	 */
	TActionFunctionReturnType getReturnType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TFunction#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(TActionFunctionReturnType value);

	/**
	 * Returns the value of the '<em><b>Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group1</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTFunction_Group1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:4'"
	 * @generated
	 */
	FeatureMap getGroup1();

	/**
	 * Returns the value of the '<em><b>Annotation1</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation1</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTFunction_Annotation1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation1();

	/**
	 * Returns the value of the '<em><b>Entity Set Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Set Path</em>' attribute.
	 * @see #setEntitySetPath(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTFunction_EntitySetPath()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TPath"
	 *        extendedMetaData="kind='attribute' name='EntitySetPath'"
	 * @generated
	 */
	String getEntitySetPath();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TFunction#getEntitySetPath <em>Entity Set Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Set Path</em>' attribute.
	 * @see #getEntitySetPath()
	 * @generated
	 */
	void setEntitySetPath(String value);

	/**
	 * Returns the value of the '<em><b>Is Bound</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Bound</em>' attribute.
	 * @see #isSetIsBound()
	 * @see #unsetIsBound()
	 * @see #setIsBound(boolean)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTFunction_IsBound()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsBound'"
	 * @generated
	 */
	boolean isIsBound();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TFunction#isIsBound <em>Is Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Bound</em>' attribute.
	 * @see #isSetIsBound()
	 * @see #unsetIsBound()
	 * @see #isIsBound()
	 * @generated
	 */
	void setIsBound(boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TFunction#isIsBound <em>Is Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsBound()
	 * @see #isIsBound()
	 * @see #setIsBound(boolean)
	 * @generated
	 */
	void unsetIsBound();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.odata.ns.edm.TFunction#isIsBound <em>Is Bound</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Bound</em>' attribute is set.
	 * @see #unsetIsBound()
	 * @see #isIsBound()
	 * @see #setIsBound(boolean)
	 * @generated
	 */
	boolean isSetIsBound();

	/**
	 * Returns the value of the '<em><b>Is Composable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composable</em>' attribute.
	 * @see #isSetIsComposable()
	 * @see #unsetIsComposable()
	 * @see #setIsComposable(boolean)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTFunction_IsComposable()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsComposable'"
	 * @generated
	 */
	boolean isIsComposable();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TFunction#isIsComposable <em>Is Composable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composable</em>' attribute.
	 * @see #isSetIsComposable()
	 * @see #unsetIsComposable()
	 * @see #isIsComposable()
	 * @generated
	 */
	void setIsComposable(boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TFunction#isIsComposable <em>Is Composable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsComposable()
	 * @see #isIsComposable()
	 * @see #setIsComposable(boolean)
	 * @generated
	 */
	void unsetIsComposable();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.odata.ns.edm.TFunction#isIsComposable <em>Is Composable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Composable</em>' attribute is set.
	 * @see #unsetIsComposable()
	 * @see #isIsComposable()
	 * @see #setIsComposable(boolean)
	 * @generated
	 */
	boolean isSetIsComposable();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTFunction_Name()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TSimpleIdentifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TFunction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TFunction
