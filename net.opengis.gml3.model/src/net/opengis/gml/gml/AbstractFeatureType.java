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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Feature Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The basic feature model is given by the gml:AbstractFeatureType.
 * The content model for gml:AbstractFeatureType adds two specific properties suitable for geographic features to the content model defined in gml:AbstractGMLType. 
 * The value of the gml:boundedBy property describes an envelope that encloses the entire feature instance, and is primarily useful for supporting rapid searching for features that occur in a particular location. 
 * The value of the gml:location property describes the extent, position or relative location of the feature.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.AbstractFeatureType#getBoundedBy <em>Bounded By</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AbstractFeatureType#getLocationGroup <em>Location Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AbstractFeatureType#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getAbstractFeatureType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractFeatureType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractFeatureType extends AbstractGMLType {
	/**
	 * Returns the value of the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property describes the minimum bounding box or rectangle that encloses the entire feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bounded By</em>' containment reference.
	 * @see #isSetBoundedBy()
	 * @see #unsetBoundedBy()
	 * @see #setBoundedBy(BoundingShapeType)
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractFeatureType_BoundedBy()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='boundedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	BoundingShapeType getBoundedBy();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AbstractFeatureType#getBoundedBy <em>Bounded By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounded By</em>' containment reference.
	 * @see #isSetBoundedBy()
	 * @see #unsetBoundedBy()
	 * @see #getBoundedBy()
	 * @generated
	 */
	void setBoundedBy(BoundingShapeType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.AbstractFeatureType#getBoundedBy <em>Bounded By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoundedBy()
	 * @see #getBoundedBy()
	 * @see #setBoundedBy(BoundingShapeType)
	 * @generated
	 */
	void unsetBoundedBy();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.AbstractFeatureType#getBoundedBy <em>Bounded By</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bounded By</em>' containment reference is set.
	 * @see #unsetBoundedBy()
	 * @see #getBoundedBy()
	 * @see #setBoundedBy(BoundingShapeType)
	 * @generated
	 */
	boolean isSetBoundedBy();

	/**
	 * Returns the value of the '<em><b>Location Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractFeatureType_LocationGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='location:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLocationGroup();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(LocationPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractFeatureType_Location()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace' group='location:group'"
	 * @generated
	 */
	LocationPropertyType getLocation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AbstractFeatureType#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LocationPropertyType value);

} // AbstractFeatureType
