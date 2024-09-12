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
package net.opengis.kml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boundary Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.BoundaryType#getLinearRing <em>Linear Ring</em>}</li>
 *   <li>{@link net.opengis.kml.BoundaryType#getBoundarySimpleExtensionGroupGroup <em>Boundary Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.BoundaryType#getBoundarySimpleExtensionGroup <em>Boundary Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.BoundaryType#getBoundaryObjectExtensionGroupGroup <em>Boundary Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.BoundaryType#getBoundaryObjectExtensionGroup <em>Boundary Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getBoundaryType()
 * @model extendedMetaData="name='BoundaryType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BoundaryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Linear Ring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Ring</em>' containment reference.
	 * @see #setLinearRing(LinearRingType)
	 * @see net.opengis.kml.KMLPackage#getBoundaryType_LinearRing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LinearRing' namespace='##targetNamespace'"
	 * @generated
	 */
	LinearRingType getLinearRing();

	/**
	 * Sets the value of the '{@link net.opengis.kml.BoundaryType#getLinearRing <em>Linear Ring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Ring</em>' containment reference.
	 * @see #getLinearRing()
	 * @generated
	 */
	void setLinearRing(LinearRingType value);

	/**
	 * Returns the value of the '<em><b>Boundary Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getBoundaryType_BoundarySimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='BoundarySimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getBoundarySimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Boundary Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getBoundaryType_BoundarySimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BoundarySimpleExtensionGroup' namespace='##targetNamespace' group='BoundarySimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getBoundarySimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Boundary Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getBoundaryType_BoundaryObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='BoundaryObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getBoundaryObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Boundary Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getBoundaryType_BoundaryObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BoundaryObjectExtensionGroup' namespace='##targetNamespace' group='BoundaryObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getBoundaryObjectExtensionGroup();

} // BoundaryType
