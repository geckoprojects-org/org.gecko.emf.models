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
package net.opengis.gml.gml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Ring Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A property with the content model of gml:AbstractRingPropertyType encapsulates a ring to represent the surface boundary property of a surface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.AbstractRingPropertyType#getAbstractRingGroup <em>Abstract Ring Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AbstractRingPropertyType#getAbstractRing <em>Abstract Ring</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getAbstractRingPropertyType()
 * @model extendedMetaData="name='AbstractRingPropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractRingPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstract Ring Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An abstraction of a ring to support surface boundaries of different complexity.
	 * The AbstractRing element is the abstract head of the substituition group for all closed boundaries of a surface patch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Ring Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractRingPropertyType_AbstractRingGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='AbstractRing:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractRingGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Ring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An abstraction of a ring to support surface boundaries of different complexity.
	 * The AbstractRing element is the abstract head of the substituition group for all closed boundaries of a surface patch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Ring</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractRingPropertyType_AbstractRing()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractRing' namespace='##targetNamespace' group='AbstractRing:group'"
	 * @generated
	 */
	AbstractRingType getAbstractRing();

} // AbstractRingPropertyType
