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
 * A representation of the model object '<em><b>View Volume Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.ViewVolumeType#getLeftFov <em>Left Fov</em>}</li>
 *   <li>{@link net.opengis.kml.ViewVolumeType#getRightFov <em>Right Fov</em>}</li>
 *   <li>{@link net.opengis.kml.ViewVolumeType#getBottomFov <em>Bottom Fov</em>}</li>
 *   <li>{@link net.opengis.kml.ViewVolumeType#getTopFov <em>Top Fov</em>}</li>
 *   <li>{@link net.opengis.kml.ViewVolumeType#getNear <em>Near</em>}</li>
 *   <li>{@link net.opengis.kml.ViewVolumeType#getViewVolumeSimpleExtensionGroupGroup <em>View Volume Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.ViewVolumeType#getViewVolumeSimpleExtensionGroup <em>View Volume Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.ViewVolumeType#getViewVolumeObjectExtensionGroupGroup <em>View Volume Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.ViewVolumeType#getViewVolumeObjectExtensionGroup <em>View Volume Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getViewVolumeType()
 * @model extendedMetaData="name='ViewVolumeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ViewVolumeType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Left Fov</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Fov</em>' attribute.
	 * @see #isSetLeftFov()
	 * @see #unsetLeftFov()
	 * @see #setLeftFov(double)
	 * @see net.opengis.kml.KMLPackage#getViewVolumeType_LeftFov()
	 * @model default="0.0" unsettable="true" dataType="net.opengis.kml.Angle180Type"
	 *        extendedMetaData="kind='element' name='leftFov' namespace='##targetNamespace'"
	 * @generated
	 */
	double getLeftFov();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ViewVolumeType#getLeftFov <em>Left Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Fov</em>' attribute.
	 * @see #isSetLeftFov()
	 * @see #unsetLeftFov()
	 * @see #getLeftFov()
	 * @generated
	 */
	void setLeftFov(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.ViewVolumeType#getLeftFov <em>Left Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLeftFov()
	 * @see #getLeftFov()
	 * @see #setLeftFov(double)
	 * @generated
	 */
	void unsetLeftFov();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.ViewVolumeType#getLeftFov <em>Left Fov</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Left Fov</em>' attribute is set.
	 * @see #unsetLeftFov()
	 * @see #getLeftFov()
	 * @see #setLeftFov(double)
	 * @generated
	 */
	boolean isSetLeftFov();

	/**
	 * Returns the value of the '<em><b>Right Fov</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Fov</em>' attribute.
	 * @see #isSetRightFov()
	 * @see #unsetRightFov()
	 * @see #setRightFov(double)
	 * @see net.opengis.kml.KMLPackage#getViewVolumeType_RightFov()
	 * @model default="0.0" unsettable="true" dataType="net.opengis.kml.Angle180Type"
	 *        extendedMetaData="kind='element' name='rightFov' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRightFov();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ViewVolumeType#getRightFov <em>Right Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Fov</em>' attribute.
	 * @see #isSetRightFov()
	 * @see #unsetRightFov()
	 * @see #getRightFov()
	 * @generated
	 */
	void setRightFov(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.ViewVolumeType#getRightFov <em>Right Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRightFov()
	 * @see #getRightFov()
	 * @see #setRightFov(double)
	 * @generated
	 */
	void unsetRightFov();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.ViewVolumeType#getRightFov <em>Right Fov</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Right Fov</em>' attribute is set.
	 * @see #unsetRightFov()
	 * @see #getRightFov()
	 * @see #setRightFov(double)
	 * @generated
	 */
	boolean isSetRightFov();

	/**
	 * Returns the value of the '<em><b>Bottom Fov</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Fov</em>' attribute.
	 * @see #isSetBottomFov()
	 * @see #unsetBottomFov()
	 * @see #setBottomFov(double)
	 * @see net.opengis.kml.KMLPackage#getViewVolumeType_BottomFov()
	 * @model default="0.0" unsettable="true" dataType="net.opengis.kml.Angle90Type"
	 *        extendedMetaData="kind='element' name='bottomFov' namespace='##targetNamespace'"
	 * @generated
	 */
	double getBottomFov();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ViewVolumeType#getBottomFov <em>Bottom Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom Fov</em>' attribute.
	 * @see #isSetBottomFov()
	 * @see #unsetBottomFov()
	 * @see #getBottomFov()
	 * @generated
	 */
	void setBottomFov(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.ViewVolumeType#getBottomFov <em>Bottom Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBottomFov()
	 * @see #getBottomFov()
	 * @see #setBottomFov(double)
	 * @generated
	 */
	void unsetBottomFov();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.ViewVolumeType#getBottomFov <em>Bottom Fov</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bottom Fov</em>' attribute is set.
	 * @see #unsetBottomFov()
	 * @see #getBottomFov()
	 * @see #setBottomFov(double)
	 * @generated
	 */
	boolean isSetBottomFov();

	/**
	 * Returns the value of the '<em><b>Top Fov</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Fov</em>' attribute.
	 * @see #isSetTopFov()
	 * @see #unsetTopFov()
	 * @see #setTopFov(double)
	 * @see net.opengis.kml.KMLPackage#getViewVolumeType_TopFov()
	 * @model default="0.0" unsettable="true" dataType="net.opengis.kml.Angle90Type"
	 *        extendedMetaData="kind='element' name='topFov' namespace='##targetNamespace'"
	 * @generated
	 */
	double getTopFov();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ViewVolumeType#getTopFov <em>Top Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Fov</em>' attribute.
	 * @see #isSetTopFov()
	 * @see #unsetTopFov()
	 * @see #getTopFov()
	 * @generated
	 */
	void setTopFov(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.ViewVolumeType#getTopFov <em>Top Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTopFov()
	 * @see #getTopFov()
	 * @see #setTopFov(double)
	 * @generated
	 */
	void unsetTopFov();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.ViewVolumeType#getTopFov <em>Top Fov</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Top Fov</em>' attribute is set.
	 * @see #unsetTopFov()
	 * @see #getTopFov()
	 * @see #setTopFov(double)
	 * @generated
	 */
	boolean isSetTopFov();

	/**
	 * Returns the value of the '<em><b>Near</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Near</em>' attribute.
	 * @see #isSetNear()
	 * @see #unsetNear()
	 * @see #setNear(double)
	 * @see net.opengis.kml.KMLPackage#getViewVolumeType_Near()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='near' namespace='##targetNamespace'"
	 * @generated
	 */
	double getNear();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ViewVolumeType#getNear <em>Near</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Near</em>' attribute.
	 * @see #isSetNear()
	 * @see #unsetNear()
	 * @see #getNear()
	 * @generated
	 */
	void setNear(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.ViewVolumeType#getNear <em>Near</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNear()
	 * @see #getNear()
	 * @see #setNear(double)
	 * @generated
	 */
	void unsetNear();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.ViewVolumeType#getNear <em>Near</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Near</em>' attribute is set.
	 * @see #unsetNear()
	 * @see #getNear()
	 * @see #setNear(double)
	 * @generated
	 */
	boolean isSetNear();

	/**
	 * Returns the value of the '<em><b>View Volume Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Volume Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getViewVolumeType_ViewVolumeSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ViewVolumeSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getViewVolumeSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>View Volume Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Volume Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getViewVolumeType_ViewVolumeSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ViewVolumeSimpleExtensionGroup' namespace='##targetNamespace' group='ViewVolumeSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getViewVolumeSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>View Volume Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Volume Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getViewVolumeType_ViewVolumeObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ViewVolumeObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getViewVolumeObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>View Volume Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Volume Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getViewVolumeType_ViewVolumeObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ViewVolumeObjectExtensionGroup' namespace='##targetNamespace' group='ViewVolumeObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getViewVolumeObjectExtensionGroup();

} // ViewVolumeType
