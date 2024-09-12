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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lod Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.LodType#getMinLodPixels <em>Min Lod Pixels</em>}</li>
 *   <li>{@link net.opengis.kml.LodType#getMaxLodPixels <em>Max Lod Pixels</em>}</li>
 *   <li>{@link net.opengis.kml.LodType#getMinFadeExtent <em>Min Fade Extent</em>}</li>
 *   <li>{@link net.opengis.kml.LodType#getMaxFadeExtent <em>Max Fade Extent</em>}</li>
 *   <li>{@link net.opengis.kml.LodType#getLodSimpleExtensionGroupGroup <em>Lod Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.LodType#getLodSimpleExtensionGroup <em>Lod Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.LodType#getLodObjectExtensionGroupGroup <em>Lod Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.LodType#getLodObjectExtensionGroup <em>Lod Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getLodType()
 * @model extendedMetaData="name='LodType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LodType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Min Lod Pixels</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Lod Pixels</em>' attribute.
	 * @see #isSetMinLodPixels()
	 * @see #unsetMinLodPixels()
	 * @see #setMinLodPixels(double)
	 * @see net.opengis.kml.KMLPackage#getLodType_MinLodPixels()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='minLodPixels' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMinLodPixels();

	/**
	 * Sets the value of the '{@link net.opengis.kml.LodType#getMinLodPixels <em>Min Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Lod Pixels</em>' attribute.
	 * @see #isSetMinLodPixels()
	 * @see #unsetMinLodPixels()
	 * @see #getMinLodPixels()
	 * @generated
	 */
	void setMinLodPixels(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.LodType#getMinLodPixels <em>Min Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinLodPixels()
	 * @see #getMinLodPixels()
	 * @see #setMinLodPixels(double)
	 * @generated
	 */
	void unsetMinLodPixels();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.LodType#getMinLodPixels <em>Min Lod Pixels</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Lod Pixels</em>' attribute is set.
	 * @see #unsetMinLodPixels()
	 * @see #getMinLodPixels()
	 * @see #setMinLodPixels(double)
	 * @generated
	 */
	boolean isSetMinLodPixels();

	/**
	 * Returns the value of the '<em><b>Max Lod Pixels</b></em>' attribute.
	 * The default value is <code>"-1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Lod Pixels</em>' attribute.
	 * @see #isSetMaxLodPixels()
	 * @see #unsetMaxLodPixels()
	 * @see #setMaxLodPixels(double)
	 * @see net.opengis.kml.KMLPackage#getLodType_MaxLodPixels()
	 * @model default="-1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='maxLodPixels' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaxLodPixels();

	/**
	 * Sets the value of the '{@link net.opengis.kml.LodType#getMaxLodPixels <em>Max Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Lod Pixels</em>' attribute.
	 * @see #isSetMaxLodPixels()
	 * @see #unsetMaxLodPixels()
	 * @see #getMaxLodPixels()
	 * @generated
	 */
	void setMaxLodPixels(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.LodType#getMaxLodPixels <em>Max Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxLodPixels()
	 * @see #getMaxLodPixels()
	 * @see #setMaxLodPixels(double)
	 * @generated
	 */
	void unsetMaxLodPixels();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.LodType#getMaxLodPixels <em>Max Lod Pixels</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Lod Pixels</em>' attribute is set.
	 * @see #unsetMaxLodPixels()
	 * @see #getMaxLodPixels()
	 * @see #setMaxLodPixels(double)
	 * @generated
	 */
	boolean isSetMaxLodPixels();

	/**
	 * Returns the value of the '<em><b>Min Fade Extent</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Fade Extent</em>' attribute.
	 * @see #isSetMinFadeExtent()
	 * @see #unsetMinFadeExtent()
	 * @see #setMinFadeExtent(double)
	 * @see net.opengis.kml.KMLPackage#getLodType_MinFadeExtent()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='minFadeExtent' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMinFadeExtent();

	/**
	 * Sets the value of the '{@link net.opengis.kml.LodType#getMinFadeExtent <em>Min Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Fade Extent</em>' attribute.
	 * @see #isSetMinFadeExtent()
	 * @see #unsetMinFadeExtent()
	 * @see #getMinFadeExtent()
	 * @generated
	 */
	void setMinFadeExtent(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.LodType#getMinFadeExtent <em>Min Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinFadeExtent()
	 * @see #getMinFadeExtent()
	 * @see #setMinFadeExtent(double)
	 * @generated
	 */
	void unsetMinFadeExtent();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.LodType#getMinFadeExtent <em>Min Fade Extent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Fade Extent</em>' attribute is set.
	 * @see #unsetMinFadeExtent()
	 * @see #getMinFadeExtent()
	 * @see #setMinFadeExtent(double)
	 * @generated
	 */
	boolean isSetMinFadeExtent();

	/**
	 * Returns the value of the '<em><b>Max Fade Extent</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Fade Extent</em>' attribute.
	 * @see #isSetMaxFadeExtent()
	 * @see #unsetMaxFadeExtent()
	 * @see #setMaxFadeExtent(double)
	 * @see net.opengis.kml.KMLPackage#getLodType_MaxFadeExtent()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='maxFadeExtent' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaxFadeExtent();

	/**
	 * Sets the value of the '{@link net.opengis.kml.LodType#getMaxFadeExtent <em>Max Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Fade Extent</em>' attribute.
	 * @see #isSetMaxFadeExtent()
	 * @see #unsetMaxFadeExtent()
	 * @see #getMaxFadeExtent()
	 * @generated
	 */
	void setMaxFadeExtent(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.LodType#getMaxFadeExtent <em>Max Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxFadeExtent()
	 * @see #getMaxFadeExtent()
	 * @see #setMaxFadeExtent(double)
	 * @generated
	 */
	void unsetMaxFadeExtent();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.LodType#getMaxFadeExtent <em>Max Fade Extent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Fade Extent</em>' attribute is set.
	 * @see #unsetMaxFadeExtent()
	 * @see #getMaxFadeExtent()
	 * @see #setMaxFadeExtent(double)
	 * @generated
	 */
	boolean isSetMaxFadeExtent();

	/**
	 * Returns the value of the '<em><b>Lod Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLodType_LodSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LodSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLodSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Lod Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLodType_LodSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LodSimpleExtensionGroup' namespace='##targetNamespace' group='LodSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getLodSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Lod Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLodType_LodObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LodObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLodObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Lod Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getLodType_LodObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LodObjectExtensionGroup' namespace='##targetNamespace' group='LodObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getLodObjectExtensionGroup();

} // LodType
