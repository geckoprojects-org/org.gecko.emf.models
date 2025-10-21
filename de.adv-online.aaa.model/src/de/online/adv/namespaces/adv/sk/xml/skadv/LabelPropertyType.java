/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package de.online.adv.namespaces.adv.sk.xml.skadv;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getLabelGroup <em>Label Group</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getLabel <em>Label</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getHref <em>Href</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getRole <em>Role</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getShow <em>Show</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getTitle <em>Title</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelPropertyType()
 * @model extendedMetaData="name='LabelPropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LabelPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Label Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Label steuert das Aussehen von Text und legt fest, wie dieser durch die Geometrie zu verorten ist. Der Textinhalt wird normalerweise durch das zugehörige Emit-Objekt vorgegeben. Diese Vorgabe im Emit kann aber durch eine Angabe im Label-Objekt überschrieben werden.
	 * 
	 * Um Kompatibilität mit dem bisherigen SK zu ermöglichen, ist Label als konkrete Klasse angelegt. Dies war im Design eigentlich nicht beabsichtigt gewesen. Der Grund ist der, dass im bisherigen SK die zu treffende Unterscheidung zwischen linienbezogener und punktbezogener Ausgestaltung nur in den textlich verfassten Positionierungsregeln beschrieben wird. 
	 * 
	 * Wenn diese später in eine exakte Form überführt werden, wird empfohlen, die Verwendung von Label zugunsten der beiden konkreten Ausprägungen, LineLabel und PointLabel, aufzugeben.
	 * 
	 * Die Steuerung der Textausgabe ermöglicht die Angabe des Texts selbst als Expression. Weiter können angegeben werden seine Größe, die Sperrung des Texts, mehrere Arten der Unterstreichung, seine Skalierung und seine Ausrichtung. Die Farbe wird über SolidFill ausgewählt. Die typischen Font-Parameter sind in einem angeschlossenen Font-Objekt zusammengefasst.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label Group</em>' attribute list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelPropertyType_LabelGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='Label:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLabelGroup();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Label steuert das Aussehen von Text und legt fest, wie dieser durch die Geometrie zu verorten ist. Der Textinhalt wird normalerweise durch das zugehörige Emit-Objekt vorgegeben. Diese Vorgabe im Emit kann aber durch eine Angabe im Label-Objekt überschrieben werden.
	 * 
	 * Um Kompatibilität mit dem bisherigen SK zu ermöglichen, ist Label als konkrete Klasse angelegt. Dies war im Design eigentlich nicht beabsichtigt gewesen. Der Grund ist der, dass im bisherigen SK die zu treffende Unterscheidung zwischen linienbezogener und punktbezogener Ausgestaltung nur in den textlich verfassten Positionierungsregeln beschrieben wird. 
	 * 
	 * Wenn diese später in eine exakte Form überführt werden, wird empfohlen, die Verwendung von Label zugunsten der beiden konkreten Ausprägungen, LineLabel und PointLabel, aufzugeben.
	 * 
	 * Die Steuerung der Textausgabe ermöglicht die Angabe des Texts selbst als Expression. Weiter können angegeben werden seine Größe, die Sperrung des Texts, mehrere Arten der Unterstreichung, seine Skalierung und seine Ausrichtung. Die Farbe wird über SolidFill ausgewählt. Die typischen Font-Parameter sind in einem angeschlossenen Font-Objekt zusammengefasst.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(LabelType3)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelPropertyType_Label()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Label' namespace='##targetNamespace' group='Label:group'"
	 * @generated
	 */
	LabelType3 getLabel();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(LabelType3 value);

	/**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ActuateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelPropertyType_Actuate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType getActuate();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @generated
	 */
	void setActuate(ActuateType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getActuate <em>Actuate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuate</em>' attribute is set.
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	boolean isSetActuate();

	/**
	 * Returns the value of the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcrole</em>' attribute.
	 * @see #setArcrole(String)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelPropertyType_Arcrole()
	 * @model dataType="org.w3._1999.xlink.ArcroleType"
	 *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getArcrole();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getArcrole <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arcrole</em>' attribute.
	 * @see #getArcrole()
	 * @generated
	 */
	void setArcrole(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelPropertyType_Href()
	 * @model dataType="org.w3._1999.xlink.HrefType"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelPropertyType_Role()
	 * @model dataType="org.w3._1999.xlink.RoleType"
	 *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ShowType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(ShowType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelPropertyType_Show()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ShowType getShow();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #getShow()
	 * @generated
	 */
	void setShow(ShowType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getShow <em>Show</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show</em>' attribute is set.
	 * @see #unsetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	boolean isSetShow();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelPropertyType_Title()
	 * @model dataType="org.w3._1999.xlink.TitleAttrType"
	 *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"simple"</code>.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.TypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.w3._1999.xlink.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelPropertyType_Type()
	 * @model default="simple" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.w3._1999.xlink.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

} // LabelPropertyType
