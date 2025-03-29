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
package org.omg.spec.bpmn.bpmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TGlobal Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TGlobalTask#getResourceRoleGroup <em>Resource Role Group</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TGlobalTask#getResourceRole <em>Resource Role</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTGlobalTask()
 * @model extendedMetaData="name='tGlobalTask' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TGlobalTask extends TCallableElement {
	/**
	 * Returns the value of the '<em><b>Resource Role Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Role Group</em>' attribute list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTGlobalTask_ResourceRoleGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='resourceRole:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getResourceRoleGroup();

	/**
	 * Returns the value of the '<em><b>Resource Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TResourceRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Role</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTGlobalTask_ResourceRole()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resourceRole' namespace='##targetNamespace' group='resourceRole:group'"
	 * @generated
	 */
	EList<TResourceRole> getResourceRole();

} // TGlobalTask
