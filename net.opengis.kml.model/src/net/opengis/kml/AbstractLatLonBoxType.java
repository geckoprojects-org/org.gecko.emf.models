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
 * A representation of the model object '<em><b>Abstract Lat Lon Box Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.AbstractLatLonBoxType#getNorth <em>North</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractLatLonBoxType#getSouth <em>South</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractLatLonBoxType#getEast <em>East</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractLatLonBoxType#getWest <em>West</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractLatLonBoxType#getAbstractLatLonBoxSimpleExtensionGroupGroup <em>Abstract Lat Lon Box Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractLatLonBoxType#getAbstractLatLonBoxSimpleExtensionGroup <em>Abstract Lat Lon Box Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractLatLonBoxType#getAbstractLatLonBoxObjectExtensionGroupGroup <em>Abstract Lat Lon Box Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractLatLonBoxType#getAbstractLatLonBoxObjectExtensionGroup <em>Abstract Lat Lon Box Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getAbstractLatLonBoxType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractLatLonBoxType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractLatLonBoxType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>North</b></em>' attribute.
	 * The default value is <code>"180.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>North</em>' attribute.
	 * @see #isSetNorth()
	 * @see #unsetNorth()
	 * @see #setNorth(double)
	 * @see net.opengis.kml.KMLPackage#getAbstractLatLonBoxType_North()
	 * @model default="180.0" unsettable="true" dataType="net.opengis.kml.Angle180Type"
	 *        extendedMetaData="kind='element' name='north' namespace='##targetNamespace'"
	 * @generated
	 */
	double getNorth();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractLatLonBoxType#getNorth <em>North</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>North</em>' attribute.
	 * @see #isSetNorth()
	 * @see #unsetNorth()
	 * @see #getNorth()
	 * @generated
	 */
	void setNorth(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.AbstractLatLonBoxType#getNorth <em>North</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNorth()
	 * @see #getNorth()
	 * @see #setNorth(double)
	 * @generated
	 */
	void unsetNorth();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.AbstractLatLonBoxType#getNorth <em>North</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>North</em>' attribute is set.
	 * @see #unsetNorth()
	 * @see #getNorth()
	 * @see #setNorth(double)
	 * @generated
	 */
	boolean isSetNorth();

	/**
	 * Returns the value of the '<em><b>South</b></em>' attribute.
	 * The default value is <code>"-180.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>South</em>' attribute.
	 * @see #isSetSouth()
	 * @see #unsetSouth()
	 * @see #setSouth(double)
	 * @see net.opengis.kml.KMLPackage#getAbstractLatLonBoxType_South()
	 * @model default="-180.0" unsettable="true" dataType="net.opengis.kml.Angle180Type"
	 *        extendedMetaData="kind='element' name='south' namespace='##targetNamespace'"
	 * @generated
	 */
	double getSouth();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractLatLonBoxType#getSouth <em>South</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>South</em>' attribute.
	 * @see #isSetSouth()
	 * @see #unsetSouth()
	 * @see #getSouth()
	 * @generated
	 */
	void setSouth(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.AbstractLatLonBoxType#getSouth <em>South</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSouth()
	 * @see #getSouth()
	 * @see #setSouth(double)
	 * @generated
	 */
	void unsetSouth();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.AbstractLatLonBoxType#getSouth <em>South</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>South</em>' attribute is set.
	 * @see #unsetSouth()
	 * @see #getSouth()
	 * @see #setSouth(double)
	 * @generated
	 */
	boolean isSetSouth();

	/**
	 * Returns the value of the '<em><b>East</b></em>' attribute.
	 * The default value is <code>"180.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>East</em>' attribute.
	 * @see #isSetEast()
	 * @see #unsetEast()
	 * @see #setEast(double)
	 * @see net.opengis.kml.KMLPackage#getAbstractLatLonBoxType_East()
	 * @model default="180.0" unsettable="true" dataType="net.opengis.kml.Angle180Type"
	 *        extendedMetaData="kind='element' name='east' namespace='##targetNamespace'"
	 * @generated
	 */
	double getEast();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractLatLonBoxType#getEast <em>East</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>East</em>' attribute.
	 * @see #isSetEast()
	 * @see #unsetEast()
	 * @see #getEast()
	 * @generated
	 */
	void setEast(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.AbstractLatLonBoxType#getEast <em>East</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEast()
	 * @see #getEast()
	 * @see #setEast(double)
	 * @generated
	 */
	void unsetEast();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.AbstractLatLonBoxType#getEast <em>East</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>East</em>' attribute is set.
	 * @see #unsetEast()
	 * @see #getEast()
	 * @see #setEast(double)
	 * @generated
	 */
	boolean isSetEast();

	/**
	 * Returns the value of the '<em><b>West</b></em>' attribute.
	 * The default value is <code>"-180.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>West</em>' attribute.
	 * @see #isSetWest()
	 * @see #unsetWest()
	 * @see #setWest(double)
	 * @see net.opengis.kml.KMLPackage#getAbstractLatLonBoxType_West()
	 * @model default="-180.0" unsettable="true" dataType="net.opengis.kml.Angle180Type"
	 *        extendedMetaData="kind='element' name='west' namespace='##targetNamespace'"
	 * @generated
	 */
	double getWest();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractLatLonBoxType#getWest <em>West</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>West</em>' attribute.
	 * @see #isSetWest()
	 * @see #unsetWest()
	 * @see #getWest()
	 * @generated
	 */
	void setWest(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.AbstractLatLonBoxType#getWest <em>West</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWest()
	 * @see #getWest()
	 * @see #setWest(double)
	 * @generated
	 */
	void unsetWest();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.AbstractLatLonBoxType#getWest <em>West</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>West</em>' attribute is set.
	 * @see #unsetWest()
	 * @see #getWest()
	 * @see #setWest(double)
	 * @generated
	 */
	boolean isSetWest();

	/**
	 * Returns the value of the '<em><b>Abstract Lat Lon Box Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Lat Lon Box Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractLatLonBoxType_AbstractLatLonBoxSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractLatLonBoxSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractLatLonBoxSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Lat Lon Box Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Lat Lon Box Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractLatLonBoxType_AbstractLatLonBoxSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractLatLonBoxSimpleExtensionGroup' namespace='##targetNamespace' group='AbstractLatLonBoxSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getAbstractLatLonBoxSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Lat Lon Box Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Lat Lon Box Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractLatLonBoxType_AbstractLatLonBoxObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractLatLonBoxObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractLatLonBoxObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Lat Lon Box Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Lat Lon Box Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getAbstractLatLonBoxType_AbstractLatLonBoxObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractLatLonBoxObjectExtensionGroup' namespace='##targetNamespace' group='AbstractLatLonBoxObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getAbstractLatLonBoxObjectExtensionGroup();

} // AbstractLatLonBoxType
