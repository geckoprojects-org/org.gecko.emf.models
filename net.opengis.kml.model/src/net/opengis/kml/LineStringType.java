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

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.LineStringType#isExtrude <em>Extrude</em>}</li>
 *   <li>{@link net.opengis.kml.LineStringType#isTessellate <em>Tessellate</em>}</li>
 *   <li>{@link net.opengis.kml.LineStringType#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.LineStringType#getAltitudeModeGroup <em>Altitude Mode Group</em>}</li>
 *   <li>{@link net.opengis.kml.LineStringType#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link net.opengis.kml.LineStringType#getLineStringSimpleExtensionGroupGroup <em>Line String Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.LineStringType#getLineStringSimpleExtensionGroup <em>Line String Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.LineStringType#getLineStringObjectExtensionGroupGroup <em>Line String Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.LineStringType#getLineStringObjectExtensionGroup <em>Line String Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getLineStringType()
 * @model extendedMetaData="name='LineStringType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LineStringType extends AbstractGeometryType {
	/**
	 * Returns the value of the '<em><b>Extrude</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrude</em>' attribute.
	 * @see #isSetExtrude()
	 * @see #unsetExtrude()
	 * @see #setExtrude(boolean)
	 * @see net.opengis.kml.KMLPackage#getLineStringType_Extrude()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='extrude' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isExtrude();

	/**
	 * Sets the value of the '{@link net.opengis.kml.LineStringType#isExtrude <em>Extrude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrude</em>' attribute.
	 * @see #isSetExtrude()
	 * @see #unsetExtrude()
	 * @see #isExtrude()
	 * @generated
	 */
	void setExtrude(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.LineStringType#isExtrude <em>Extrude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrude()
	 * @see #isExtrude()
	 * @see #setExtrude(boolean)
	 * @generated
	 */
	void unsetExtrude();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.LineStringType#isExtrude <em>Extrude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrude</em>' attribute is set.
	 * @see #unsetExtrude()
	 * @see #isExtrude()
	 * @see #setExtrude(boolean)
	 * @generated
	 */
	boolean isSetExtrude();

	/**
	 * Returns the value of the '<em><b>Tessellate</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tessellate</em>' attribute.
	 * @see #isSetTessellate()
	 * @see #unsetTessellate()
	 * @see #setTessellate(boolean)
	 * @see net.opengis.kml.KMLPackage#getLineStringType_Tessellate()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='tessellate' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isTessellate();

	/**
	 * Sets the value of the '{@link net.opengis.kml.LineStringType#isTessellate <em>Tessellate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tessellate</em>' attribute.
	 * @see #isSetTessellate()
	 * @see #unsetTessellate()
	 * @see #isTessellate()
	 * @generated
	 */
	void setTessellate(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.LineStringType#isTessellate <em>Tessellate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTessellate()
	 * @see #isTessellate()
	 * @see #setTessellate(boolean)
	 * @generated
	 */
	void unsetTessellate();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.LineStringType#isTessellate <em>Tessellate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tessellate</em>' attribute is set.
	 * @see #unsetTessellate()
	 * @see #isTessellate()
	 * @see #setTessellate(boolean)
	 * @generated
	 */
	boolean isSetTessellate();

	/**
	 * Returns the value of the '<em><b>Altitude Mode Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude Mode Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLineStringType_AltitudeModeGroupGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='altitudeModeGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAltitudeModeGroupGroup();

	/**
	 * Returns the value of the '<em><b>Altitude Mode Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude Mode Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getLineStringType_AltitudeModeGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='altitudeModeGroup' namespace='##targetNamespace' group='altitudeModeGroup:group'"
	 * @generated
	 */
	EObject getAltitudeModeGroup();

	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' attribute.
	 * @see #setCoordinates(List)
	 * @see net.opengis.kml.KMLPackage#getLineStringType_Coordinates()
	 * @model dataType="net.opengis.kml.CoordinatesType" many="false"
	 *        extendedMetaData="kind='element' name='coordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getCoordinates();

	/**
	 * Sets the value of the '{@link net.opengis.kml.LineStringType#getCoordinates <em>Coordinates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' attribute.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(List<String> value);

	/**
	 * Returns the value of the '<em><b>Line String Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line String Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLineStringType_LineStringSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LineStringSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLineStringSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Line String Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line String Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLineStringType_LineStringSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineStringSimpleExtensionGroup' namespace='##targetNamespace' group='LineStringSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getLineStringSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Line String Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line String Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLineStringType_LineStringObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LineStringObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLineStringObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Line String Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line String Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getLineStringType_LineStringObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineStringObjectExtensionGroup' namespace='##targetNamespace' group='LineStringObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getLineStringObjectExtensionGroup();

} // LineStringType
