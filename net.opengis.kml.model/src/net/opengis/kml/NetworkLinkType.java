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
 * A representation of the model object '<em><b>Network Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.NetworkLinkType#isRefreshVisibility <em>Refresh Visibility</em>}</li>
 *   <li>{@link net.opengis.kml.NetworkLinkType#isFlyToView <em>Fly To View</em>}</li>
 *   <li>{@link net.opengis.kml.NetworkLinkType#getUrl <em>Url</em>}</li>
 *   <li>{@link net.opengis.kml.NetworkLinkType#getLink1 <em>Link1</em>}</li>
 *   <li>{@link net.opengis.kml.NetworkLinkType#getNetworkLinkSimpleExtensionGroupGroup <em>Network Link Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.NetworkLinkType#getNetworkLinkSimpleExtensionGroup <em>Network Link Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.NetworkLinkType#getNetworkLinkObjectExtensionGroupGroup <em>Network Link Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.NetworkLinkType#getNetworkLinkObjectExtensionGroup <em>Network Link Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getNetworkLinkType()
 * @model extendedMetaData="name='NetworkLinkType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NetworkLinkType extends AbstractFeatureType {
	/**
	 * Returns the value of the '<em><b>Refresh Visibility</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Visibility</em>' attribute.
	 * @see #isSetRefreshVisibility()
	 * @see #unsetRefreshVisibility()
	 * @see #setRefreshVisibility(boolean)
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkType_RefreshVisibility()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='refreshVisibility' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isRefreshVisibility();

	/**
	 * Sets the value of the '{@link net.opengis.kml.NetworkLinkType#isRefreshVisibility <em>Refresh Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Visibility</em>' attribute.
	 * @see #isSetRefreshVisibility()
	 * @see #unsetRefreshVisibility()
	 * @see #isRefreshVisibility()
	 * @generated
	 */
	void setRefreshVisibility(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.NetworkLinkType#isRefreshVisibility <em>Refresh Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRefreshVisibility()
	 * @see #isRefreshVisibility()
	 * @see #setRefreshVisibility(boolean)
	 * @generated
	 */
	void unsetRefreshVisibility();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.NetworkLinkType#isRefreshVisibility <em>Refresh Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refresh Visibility</em>' attribute is set.
	 * @see #unsetRefreshVisibility()
	 * @see #isRefreshVisibility()
	 * @see #setRefreshVisibility(boolean)
	 * @generated
	 */
	boolean isSetRefreshVisibility();

	/**
	 * Returns the value of the '<em><b>Fly To View</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fly To View</em>' attribute.
	 * @see #isSetFlyToView()
	 * @see #unsetFlyToView()
	 * @see #setFlyToView(boolean)
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkType_FlyToView()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='flyToView' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isFlyToView();

	/**
	 * Sets the value of the '{@link net.opengis.kml.NetworkLinkType#isFlyToView <em>Fly To View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fly To View</em>' attribute.
	 * @see #isSetFlyToView()
	 * @see #unsetFlyToView()
	 * @see #isFlyToView()
	 * @generated
	 */
	void setFlyToView(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.NetworkLinkType#isFlyToView <em>Fly To View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlyToView()
	 * @see #isFlyToView()
	 * @see #setFlyToView(boolean)
	 * @generated
	 */
	void unsetFlyToView();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.NetworkLinkType#isFlyToView <em>Fly To View</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fly To View</em>' attribute is set.
	 * @see #unsetFlyToView()
	 * @see #isFlyToView()
	 * @see #setFlyToView(boolean)
	 * @generated
	 */
	boolean isSetFlyToView();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Url deprecated in 2.2
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(LinkType)
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkType_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Url' namespace='##targetNamespace'"
	 * @generated
	 */
	LinkType getUrl();

	/**
	 * Sets the value of the '{@link net.opengis.kml.NetworkLinkType#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(LinkType value);

	/**
	 * Returns the value of the '<em><b>Link1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link1</em>' containment reference.
	 * @see #setLink1(LinkType)
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkType_Link1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Link' namespace='##targetNamespace'"
	 * @generated
	 */
	LinkType getLink1();

	/**
	 * Sets the value of the '{@link net.opengis.kml.NetworkLinkType#getLink1 <em>Link1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link1</em>' containment reference.
	 * @see #getLink1()
	 * @generated
	 */
	void setLink1(LinkType value);

	/**
	 * Returns the value of the '<em><b>Network Link Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Link Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkType_NetworkLinkSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='NetworkLinkSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNetworkLinkSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Network Link Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Link Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkType_NetworkLinkSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NetworkLinkSimpleExtensionGroup' namespace='##targetNamespace' group='NetworkLinkSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getNetworkLinkSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Network Link Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Link Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkType_NetworkLinkObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='NetworkLinkObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNetworkLinkObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Network Link Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Link Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkType_NetworkLinkObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NetworkLinkObjectExtensionGroup' namespace='##targetNamespace' group='NetworkLinkObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getNetworkLinkObjectExtensionGroup();

} // NetworkLinkType
