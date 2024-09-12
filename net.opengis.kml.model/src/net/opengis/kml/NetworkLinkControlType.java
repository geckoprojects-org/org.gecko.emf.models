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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Link Control Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.NetworkLinkControlType#getMinRefreshPeriod <em>Min Refresh Period</em>}</li>
 *   <li>{@link net.opengis.kml.NetworkLinkControlType#getMaxSessionLength <em>Max Session Length</em>}</li>
 *   <li>{@link net.opengis.kml.NetworkLinkControlType#getCookie <em>Cookie</em>}</li>
 *   <li>{@link net.opengis.kml.NetworkLinkControlType#getMessage <em>Message</em>}</li>
 *   <li>{@link net.opengis.kml.NetworkLinkControlType#getLinkName <em>Link Name</em>}</li>
 *   <li>{@link net.opengis.kml.NetworkLinkControlType#getLinkDescription <em>Link Description</em>}</li>
 *   <li>{@link net.opengis.kml.NetworkLinkControlType#getLinkSnippet <em>Link Snippet</em>}</li>
 *   <li>{@link net.opengis.kml.NetworkLinkControlType#getExpires <em>Expires</em>}</li>
 *   <li>{@link net.opengis.kml.NetworkLinkControlType#getUpdate <em>Update</em>}</li>
 *   <li>{@link net.opengis.kml.NetworkLinkControlType#getAbstractViewGroupGroup <em>Abstract View Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.NetworkLinkControlType#getAbstractViewGroup <em>Abstract View Group</em>}</li>
 *   <li>{@link net.opengis.kml.NetworkLinkControlType#getNetworkLinkControlSimpleExtensionGroupGroup <em>Network Link Control Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.NetworkLinkControlType#getNetworkLinkControlSimpleExtensionGroup <em>Network Link Control Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.NetworkLinkControlType#getNetworkLinkControlObjectExtensionGroupGroup <em>Network Link Control Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.NetworkLinkControlType#getNetworkLinkControlObjectExtensionGroup <em>Network Link Control Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getNetworkLinkControlType()
 * @model extendedMetaData="name='NetworkLinkControlType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NetworkLinkControlType extends EObject {
	/**
	 * Returns the value of the '<em><b>Min Refresh Period</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Refresh Period</em>' attribute.
	 * @see #isSetMinRefreshPeriod()
	 * @see #unsetMinRefreshPeriod()
	 * @see #setMinRefreshPeriod(double)
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkControlType_MinRefreshPeriod()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='minRefreshPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMinRefreshPeriod();

	/**
	 * Sets the value of the '{@link net.opengis.kml.NetworkLinkControlType#getMinRefreshPeriod <em>Min Refresh Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Refresh Period</em>' attribute.
	 * @see #isSetMinRefreshPeriod()
	 * @see #unsetMinRefreshPeriod()
	 * @see #getMinRefreshPeriod()
	 * @generated
	 */
	void setMinRefreshPeriod(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.NetworkLinkControlType#getMinRefreshPeriod <em>Min Refresh Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinRefreshPeriod()
	 * @see #getMinRefreshPeriod()
	 * @see #setMinRefreshPeriod(double)
	 * @generated
	 */
	void unsetMinRefreshPeriod();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.NetworkLinkControlType#getMinRefreshPeriod <em>Min Refresh Period</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Refresh Period</em>' attribute is set.
	 * @see #unsetMinRefreshPeriod()
	 * @see #getMinRefreshPeriod()
	 * @see #setMinRefreshPeriod(double)
	 * @generated
	 */
	boolean isSetMinRefreshPeriod();

	/**
	 * Returns the value of the '<em><b>Max Session Length</b></em>' attribute.
	 * The default value is <code>"-1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Session Length</em>' attribute.
	 * @see #isSetMaxSessionLength()
	 * @see #unsetMaxSessionLength()
	 * @see #setMaxSessionLength(double)
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkControlType_MaxSessionLength()
	 * @model default="-1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='maxSessionLength' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaxSessionLength();

	/**
	 * Sets the value of the '{@link net.opengis.kml.NetworkLinkControlType#getMaxSessionLength <em>Max Session Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Session Length</em>' attribute.
	 * @see #isSetMaxSessionLength()
	 * @see #unsetMaxSessionLength()
	 * @see #getMaxSessionLength()
	 * @generated
	 */
	void setMaxSessionLength(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.NetworkLinkControlType#getMaxSessionLength <em>Max Session Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxSessionLength()
	 * @see #getMaxSessionLength()
	 * @see #setMaxSessionLength(double)
	 * @generated
	 */
	void unsetMaxSessionLength();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.NetworkLinkControlType#getMaxSessionLength <em>Max Session Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Session Length</em>' attribute is set.
	 * @see #unsetMaxSessionLength()
	 * @see #getMaxSessionLength()
	 * @see #setMaxSessionLength(double)
	 * @generated
	 */
	boolean isSetMaxSessionLength();

	/**
	 * Returns the value of the '<em><b>Cookie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookie</em>' attribute.
	 * @see #setCookie(String)
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkControlType_Cookie()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='cookie' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCookie();

	/**
	 * Sets the value of the '{@link net.opengis.kml.NetworkLinkControlType#getCookie <em>Cookie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cookie</em>' attribute.
	 * @see #getCookie()
	 * @generated
	 */
	void setCookie(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkControlType_Message()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='message' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link net.opengis.kml.NetworkLinkControlType#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Name</em>' attribute.
	 * @see #setLinkName(String)
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkControlType_LinkName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='linkName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLinkName();

	/**
	 * Sets the value of the '{@link net.opengis.kml.NetworkLinkControlType#getLinkName <em>Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Name</em>' attribute.
	 * @see #getLinkName()
	 * @generated
	 */
	void setLinkName(String value);

	/**
	 * Returns the value of the '<em><b>Link Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Description</em>' attribute.
	 * @see #setLinkDescription(String)
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkControlType_LinkDescription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='linkDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLinkDescription();

	/**
	 * Sets the value of the '{@link net.opengis.kml.NetworkLinkControlType#getLinkDescription <em>Link Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Description</em>' attribute.
	 * @see #getLinkDescription()
	 * @generated
	 */
	void setLinkDescription(String value);

	/**
	 * Returns the value of the '<em><b>Link Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Snippet</em>' containment reference.
	 * @see #setLinkSnippet(SnippetType)
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkControlType_LinkSnippet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkSnippet' namespace='##targetNamespace'"
	 * @generated
	 */
	SnippetType getLinkSnippet();

	/**
	 * Sets the value of the '{@link net.opengis.kml.NetworkLinkControlType#getLinkSnippet <em>Link Snippet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Snippet</em>' containment reference.
	 * @see #getLinkSnippet()
	 * @generated
	 */
	void setLinkSnippet(SnippetType value);

	/**
	 * Returns the value of the '<em><b>Expires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expires</em>' attribute.
	 * @see #setExpires(XMLGregorianCalendar)
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkControlType_Expires()
	 * @model dataType="net.opengis.kml.DateTimeType"
	 *        extendedMetaData="kind='element' name='expires' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getExpires();

	/**
	 * Sets the value of the '{@link net.opengis.kml.NetworkLinkControlType#getExpires <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expires</em>' attribute.
	 * @see #getExpires()
	 * @generated
	 */
	void setExpires(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' containment reference.
	 * @see #setUpdate(UpdateType)
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkControlType_Update()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Update' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateType getUpdate();

	/**
	 * Sets the value of the '{@link net.opengis.kml.NetworkLinkControlType#getUpdate <em>Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update</em>' containment reference.
	 * @see #getUpdate()
	 * @generated
	 */
	void setUpdate(UpdateType value);

	/**
	 * Returns the value of the '<em><b>Abstract View Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract View Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkControlType_AbstractViewGroupGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='AbstractViewGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractViewGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract View Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract View Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkControlType_AbstractViewGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractViewGroup' namespace='##targetNamespace' group='AbstractViewGroup:group'"
	 * @generated
	 */
	AbstractViewType getAbstractViewGroup();

	/**
	 * Returns the value of the '<em><b>Network Link Control Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Link Control Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkControlType_NetworkLinkControlSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='NetworkLinkControlSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNetworkLinkControlSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Network Link Control Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Link Control Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkControlType_NetworkLinkControlSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NetworkLinkControlSimpleExtensionGroup' namespace='##targetNamespace' group='NetworkLinkControlSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getNetworkLinkControlSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Network Link Control Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Link Control Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkControlType_NetworkLinkControlObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='NetworkLinkControlObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNetworkLinkControlObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Network Link Control Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Link Control Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getNetworkLinkControlType_NetworkLinkControlObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NetworkLinkControlObjectExtensionGroup' namespace='##targetNamespace' group='NetworkLinkControlObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getNetworkLinkControlObjectExtensionGroup();

} // NetworkLinkControlType
