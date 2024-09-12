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
package net.opengis.ows;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Group Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Logical group of one or more references to remote and/or local resources, allowing including metadata about that group. A Group can be used instead of a Manifest that can only contain one group. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ows.ReferenceGroupType#getAbstractReferenceBaseGroup <em>Abstract Reference Base Group</em>}</li>
 *   <li>{@link net.opengis.ows.ReferenceGroupType#getAbstractReferenceBase <em>Abstract Reference Base</em>}</li>
 * </ul>
 *
 * @see net.opengis.ows.OWSPackage#getReferenceGroupType()
 * @model extendedMetaData="name='ReferenceGroupType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ReferenceGroupType extends BasicIdentificationType {
	/**
	 * Returns the value of the '<em><b>Abstract Reference Base Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Reference Base Group</em>' attribute list.
	 * @see net.opengis.ows.OWSPackage#getReferenceGroupType_AbstractReferenceBaseGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="true"
	 *        extendedMetaData="kind='group' name='AbstractReferenceBase:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractReferenceBaseGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Reference Base</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ows.AbstractReferenceBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Reference Base</em>' containment reference list.
	 * @see net.opengis.ows.OWSPackage#getReferenceGroupType_AbstractReferenceBase()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractReferenceBase' namespace='##targetNamespace' group='AbstractReferenceBase:group'"
	 * @generated
	 */
	EList<AbstractReferenceBaseType> getAbstractReferenceBase();

} // ReferenceGroupType
