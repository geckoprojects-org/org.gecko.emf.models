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
package net.opengis.gml;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

import org.w3._2001.smil20.language.AnimateColorType;
import org.w3._2001.smil20.language.AnimateMotionType;
import org.w3._2001.smil20.language.AnimateType;
import org.w3._2001.smil20.language.SetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Style Descriptor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base complex type for geometry, topology, label and graph styles.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.BaseStyleDescriptorType#getSpatialResolution <em>Spatial Resolution</em>}</li>
 *   <li>{@link net.opengis.gml.BaseStyleDescriptorType#getStyleVariation <em>Style Variation</em>}</li>
 *   <li>{@link net.opengis.gml.BaseStyleDescriptorType#getAnimate <em>Animate</em>}</li>
 *   <li>{@link net.opengis.gml.BaseStyleDescriptorType#getAnimateMotion <em>Animate Motion</em>}</li>
 *   <li>{@link net.opengis.gml.BaseStyleDescriptorType#getAnimateColor <em>Animate Color</em>}</li>
 *   <li>{@link net.opengis.gml.BaseStyleDescriptorType#getSet <em>Set</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getBaseStyleDescriptorType()
 * @model extendedMetaData="name='BaseStyleDescriptorType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BaseStyleDescriptorType extends AbstractGMLType {
	/**
	 * Returns the value of the '<em><b>Spatial Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Resolution</em>' containment reference.
	 * @see #setSpatialResolution(ScaleType)
	 * @see net.opengis.gml.GMLPackage#getBaseStyleDescriptorType_SpatialResolution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spatialResolution' namespace='##targetNamespace'"
	 * @generated
	 */
	ScaleType getSpatialResolution();

	/**
	 * Sets the value of the '{@link net.opengis.gml.BaseStyleDescriptorType#getSpatialResolution <em>Spatial Resolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spatial Resolution</em>' containment reference.
	 * @see #getSpatialResolution()
	 * @generated
	 */
	void setSpatialResolution(ScaleType value);

	/**
	 * Returns the value of the '<em><b>Style Variation</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.StyleVariationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Variation</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getBaseStyleDescriptorType_StyleVariation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='styleVariation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StyleVariationType> getStyleVariation();

	/**
	 * Returns the value of the '<em><b>Animate</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2001.smil20.language.AnimateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animate</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getBaseStyleDescriptorType_Animate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='animate' namespace='http://www.w3.org/2001/SMIL20/'"
	 * @generated
	 */
	EList<AnimateType> getAnimate();

	/**
	 * Returns the value of the '<em><b>Animate Motion</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2001.smil20.language.AnimateMotionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animate Motion</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getBaseStyleDescriptorType_AnimateMotion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='animateMotion' namespace='http://www.w3.org/2001/SMIL20/'"
	 * @generated
	 */
	EList<AnimateMotionType> getAnimateMotion();

	/**
	 * Returns the value of the '<em><b>Animate Color</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2001.smil20.language.AnimateColorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animate Color</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getBaseStyleDescriptorType_AnimateColor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='animateColor' namespace='http://www.w3.org/2001/SMIL20/'"
	 * @generated
	 */
	EList<AnimateColorType> getAnimateColor();

	/**
	 * Returns the value of the '<em><b>Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2001.smil20.language.SetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getBaseStyleDescriptorType_Set()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='set' namespace='http://www.w3.org/2001/SMIL20/'"
	 * @generated
	 */
	EList<SetType> getSet();

} // BaseStyleDescriptorType
