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
package org.camunda.bpmn.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.camunda.bpmn.model.ListType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.ListType#getScripts <em>Scripts</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.ListType#getMaps <em>Maps</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.ListType#getLists <em>Lists</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.ListType#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.camunda.bpmn.model.CamundaPackage#getListType()
 * @model extendedMetaData="name='list_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.camunda.bpmn.model.CamundaPackage#getListType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='value:group'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Scripts</b></em>' containment reference list.
	 * The list contents are of type {@link org.camunda.bpmn.model.ScriptType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scripts</em>' containment reference list.
	 * @see org.camunda.bpmn.model.CamundaPackage#getListType_Scripts()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='script' namespace='##targetNamespace' group='#value:group'"
	 * @generated
	 */
	EList<ScriptType> getScripts();

	/**
	 * Returns the value of the '<em><b>Maps</b></em>' containment reference list.
	 * The list contents are of type {@link org.camunda.bpmn.model.MapType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps</em>' containment reference list.
	 * @see org.camunda.bpmn.model.CamundaPackage#getListType_Maps()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='map' namespace='##targetNamespace' group='#value:group'"
	 * @generated
	 */
	EList<MapType> getMaps();

	/**
	 * Returns the value of the '<em><b>Lists</b></em>' containment reference list.
	 * The list contents are of type {@link org.camunda.bpmn.model.ListType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lists</em>' containment reference list.
	 * @see org.camunda.bpmn.model.CamundaPackage#getListType_Lists()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list' namespace='##targetNamespace' group='#value:group'"
	 * @generated
	 */
	EList<ListType> getLists();

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see org.camunda.bpmn.model.CamundaPackage#getListType_Values()
	 * @model unique="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace' group='#value:group'"
	 * @generated
	 */
	EList<String> getValues();

} // ListType
