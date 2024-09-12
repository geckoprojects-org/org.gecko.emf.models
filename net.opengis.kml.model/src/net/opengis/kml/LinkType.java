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
 * A representation of the model object '<em><b>Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.LinkType#getRefreshMode <em>Refresh Mode</em>}</li>
 *   <li>{@link net.opengis.kml.LinkType#getRefreshInterval <em>Refresh Interval</em>}</li>
 *   <li>{@link net.opengis.kml.LinkType#getViewRefreshMode <em>View Refresh Mode</em>}</li>
 *   <li>{@link net.opengis.kml.LinkType#getViewRefreshTime <em>View Refresh Time</em>}</li>
 *   <li>{@link net.opengis.kml.LinkType#getViewBoundScale <em>View Bound Scale</em>}</li>
 *   <li>{@link net.opengis.kml.LinkType#getViewFormat <em>View Format</em>}</li>
 *   <li>{@link net.opengis.kml.LinkType#getHttpQuery <em>Http Query</em>}</li>
 *   <li>{@link net.opengis.kml.LinkType#getLinkSimpleExtensionGroupGroup <em>Link Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.LinkType#getLinkSimpleExtensionGroup <em>Link Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.LinkType#getLinkObjectExtensionGroupGroup <em>Link Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.LinkType#getLinkObjectExtensionGroup <em>Link Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getLinkType()
 * @model extendedMetaData="name='LinkType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LinkType extends BasicLinkType {
	/**
	 * Returns the value of the '<em><b>Refresh Mode</b></em>' attribute.
	 * The default value is <code>"onChange"</code>.
	 * The literals are from the enumeration {@link net.opengis.kml.RefreshModeEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Mode</em>' attribute.
	 * @see net.opengis.kml.RefreshModeEnumType
	 * @see #isSetRefreshMode()
	 * @see #unsetRefreshMode()
	 * @see #setRefreshMode(RefreshModeEnumType)
	 * @see net.opengis.kml.KMLPackage#getLinkType_RefreshMode()
	 * @model default="onChange" unsettable="true"
	 *        extendedMetaData="kind='element' name='refreshMode' namespace='##targetNamespace'"
	 * @generated
	 */
	RefreshModeEnumType getRefreshMode();

	/**
	 * Sets the value of the '{@link net.opengis.kml.LinkType#getRefreshMode <em>Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Mode</em>' attribute.
	 * @see net.opengis.kml.RefreshModeEnumType
	 * @see #isSetRefreshMode()
	 * @see #unsetRefreshMode()
	 * @see #getRefreshMode()
	 * @generated
	 */
	void setRefreshMode(RefreshModeEnumType value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.LinkType#getRefreshMode <em>Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRefreshMode()
	 * @see #getRefreshMode()
	 * @see #setRefreshMode(RefreshModeEnumType)
	 * @generated
	 */
	void unsetRefreshMode();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.LinkType#getRefreshMode <em>Refresh Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refresh Mode</em>' attribute is set.
	 * @see #unsetRefreshMode()
	 * @see #getRefreshMode()
	 * @see #setRefreshMode(RefreshModeEnumType)
	 * @generated
	 */
	boolean isSetRefreshMode();

	/**
	 * Returns the value of the '<em><b>Refresh Interval</b></em>' attribute.
	 * The default value is <code>"4.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Interval</em>' attribute.
	 * @see #isSetRefreshInterval()
	 * @see #unsetRefreshInterval()
	 * @see #setRefreshInterval(double)
	 * @see net.opengis.kml.KMLPackage#getLinkType_RefreshInterval()
	 * @model default="4.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='refreshInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRefreshInterval();

	/**
	 * Sets the value of the '{@link net.opengis.kml.LinkType#getRefreshInterval <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Interval</em>' attribute.
	 * @see #isSetRefreshInterval()
	 * @see #unsetRefreshInterval()
	 * @see #getRefreshInterval()
	 * @generated
	 */
	void setRefreshInterval(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.LinkType#getRefreshInterval <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRefreshInterval()
	 * @see #getRefreshInterval()
	 * @see #setRefreshInterval(double)
	 * @generated
	 */
	void unsetRefreshInterval();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.LinkType#getRefreshInterval <em>Refresh Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refresh Interval</em>' attribute is set.
	 * @see #unsetRefreshInterval()
	 * @see #getRefreshInterval()
	 * @see #setRefreshInterval(double)
	 * @generated
	 */
	boolean isSetRefreshInterval();

	/**
	 * Returns the value of the '<em><b>View Refresh Mode</b></em>' attribute.
	 * The default value is <code>"never"</code>.
	 * The literals are from the enumeration {@link net.opengis.kml.ViewRefreshModeEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Refresh Mode</em>' attribute.
	 * @see net.opengis.kml.ViewRefreshModeEnumType
	 * @see #isSetViewRefreshMode()
	 * @see #unsetViewRefreshMode()
	 * @see #setViewRefreshMode(ViewRefreshModeEnumType)
	 * @see net.opengis.kml.KMLPackage#getLinkType_ViewRefreshMode()
	 * @model default="never" unsettable="true"
	 *        extendedMetaData="kind='element' name='viewRefreshMode' namespace='##targetNamespace'"
	 * @generated
	 */
	ViewRefreshModeEnumType getViewRefreshMode();

	/**
	 * Sets the value of the '{@link net.opengis.kml.LinkType#getViewRefreshMode <em>View Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Refresh Mode</em>' attribute.
	 * @see net.opengis.kml.ViewRefreshModeEnumType
	 * @see #isSetViewRefreshMode()
	 * @see #unsetViewRefreshMode()
	 * @see #getViewRefreshMode()
	 * @generated
	 */
	void setViewRefreshMode(ViewRefreshModeEnumType value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.LinkType#getViewRefreshMode <em>View Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetViewRefreshMode()
	 * @see #getViewRefreshMode()
	 * @see #setViewRefreshMode(ViewRefreshModeEnumType)
	 * @generated
	 */
	void unsetViewRefreshMode();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.LinkType#getViewRefreshMode <em>View Refresh Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>View Refresh Mode</em>' attribute is set.
	 * @see #unsetViewRefreshMode()
	 * @see #getViewRefreshMode()
	 * @see #setViewRefreshMode(ViewRefreshModeEnumType)
	 * @generated
	 */
	boolean isSetViewRefreshMode();

	/**
	 * Returns the value of the '<em><b>View Refresh Time</b></em>' attribute.
	 * The default value is <code>"4.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Refresh Time</em>' attribute.
	 * @see #isSetViewRefreshTime()
	 * @see #unsetViewRefreshTime()
	 * @see #setViewRefreshTime(double)
	 * @see net.opengis.kml.KMLPackage#getLinkType_ViewRefreshTime()
	 * @model default="4.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='viewRefreshTime' namespace='##targetNamespace'"
	 * @generated
	 */
	double getViewRefreshTime();

	/**
	 * Sets the value of the '{@link net.opengis.kml.LinkType#getViewRefreshTime <em>View Refresh Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Refresh Time</em>' attribute.
	 * @see #isSetViewRefreshTime()
	 * @see #unsetViewRefreshTime()
	 * @see #getViewRefreshTime()
	 * @generated
	 */
	void setViewRefreshTime(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.LinkType#getViewRefreshTime <em>View Refresh Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetViewRefreshTime()
	 * @see #getViewRefreshTime()
	 * @see #setViewRefreshTime(double)
	 * @generated
	 */
	void unsetViewRefreshTime();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.LinkType#getViewRefreshTime <em>View Refresh Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>View Refresh Time</em>' attribute is set.
	 * @see #unsetViewRefreshTime()
	 * @see #getViewRefreshTime()
	 * @see #setViewRefreshTime(double)
	 * @generated
	 */
	boolean isSetViewRefreshTime();

	/**
	 * Returns the value of the '<em><b>View Bound Scale</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Bound Scale</em>' attribute.
	 * @see #isSetViewBoundScale()
	 * @see #unsetViewBoundScale()
	 * @see #setViewBoundScale(double)
	 * @see net.opengis.kml.KMLPackage#getLinkType_ViewBoundScale()
	 * @model default="1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='viewBoundScale' namespace='##targetNamespace'"
	 * @generated
	 */
	double getViewBoundScale();

	/**
	 * Sets the value of the '{@link net.opengis.kml.LinkType#getViewBoundScale <em>View Bound Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Bound Scale</em>' attribute.
	 * @see #isSetViewBoundScale()
	 * @see #unsetViewBoundScale()
	 * @see #getViewBoundScale()
	 * @generated
	 */
	void setViewBoundScale(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.LinkType#getViewBoundScale <em>View Bound Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetViewBoundScale()
	 * @see #getViewBoundScale()
	 * @see #setViewBoundScale(double)
	 * @generated
	 */
	void unsetViewBoundScale();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.LinkType#getViewBoundScale <em>View Bound Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>View Bound Scale</em>' attribute is set.
	 * @see #unsetViewBoundScale()
	 * @see #getViewBoundScale()
	 * @see #setViewBoundScale(double)
	 * @generated
	 */
	boolean isSetViewBoundScale();

	/**
	 * Returns the value of the '<em><b>View Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Format</em>' attribute.
	 * @see #setViewFormat(String)
	 * @see net.opengis.kml.KMLPackage#getLinkType_ViewFormat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='viewFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	String getViewFormat();

	/**
	 * Sets the value of the '{@link net.opengis.kml.LinkType#getViewFormat <em>View Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Format</em>' attribute.
	 * @see #getViewFormat()
	 * @generated
	 */
	void setViewFormat(String value);

	/**
	 * Returns the value of the '<em><b>Http Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Query</em>' attribute.
	 * @see #setHttpQuery(String)
	 * @see net.opengis.kml.KMLPackage#getLinkType_HttpQuery()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='httpQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHttpQuery();

	/**
	 * Sets the value of the '{@link net.opengis.kml.LinkType#getHttpQuery <em>Http Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Query</em>' attribute.
	 * @see #getHttpQuery()
	 * @generated
	 */
	void setHttpQuery(String value);

	/**
	 * Returns the value of the '<em><b>Link Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLinkType_LinkSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LinkSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLinkSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Link Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLinkType_LinkSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LinkSimpleExtensionGroup' namespace='##targetNamespace' group='LinkSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getLinkSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Link Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLinkType_LinkObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LinkObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLinkObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Link Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getLinkType_LinkObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LinkObjectExtensionGroup' namespace='##targetNamespace' group='LinkObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getLinkObjectExtensionGroup();

} // LinkType
