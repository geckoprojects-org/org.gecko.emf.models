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
 * A representation of the model object '<em><b>TAction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TAction#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TAction#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TAction#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TAction#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TAction#getEntitySetPath <em>Entity Set Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TAction#isIsBound <em>Is Bound</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TAction#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTAction()
 * @model extendedMetaData="name='TAction' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTAction_Group()
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
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTAction_Parameter()
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
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTAction_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTAction_ReturnType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReturnType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TActionFunctionReturnType> getReturnType();

	/**
	 * Returns the value of the '<em><b>Entity Set Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Set Path</em>' attribute.
	 * @see #setEntitySetPath(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTAction_EntitySetPath()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TPath"
	 *        extendedMetaData="kind='attribute' name='EntitySetPath'"
	 * @generated
	 */
	String getEntitySetPath();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TAction#getEntitySetPath <em>Entity Set Path</em>}' attribute.
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
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTAction_IsBound()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsBound'"
	 * @generated
	 */
	boolean isIsBound();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TAction#isIsBound <em>Is Bound</em>}' attribute.
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
	 * Unsets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TAction#isIsBound <em>Is Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsBound()
	 * @see #isIsBound()
	 * @see #setIsBound(boolean)
	 * @generated
	 */
	void unsetIsBound();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.odata.ns.edm.TAction#isIsBound <em>Is Bound</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTAction_Name()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TSimpleIdentifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TAction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TAction
