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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ElementType1#getDescription <em>Description</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ElementType1#getSynopsis <em>Synopsis</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ElementType1#getVendorSpecific <em>Vendor Specific</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ElementType1#getId <em>Id</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ElementType1#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getElementType1()
 * @model abstract="true"
 *        extendedMetaData="name='ElementType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ElementType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibung der Objektinstanz.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getElementType1_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ElementType1#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Synopsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zusammenfassende Beschreibung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synopsis</em>' attribute.
	 * @see #setSynopsis(String)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getElementType1_Synopsis()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='synopsis' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSynopsis();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ElementType1#getSynopsis <em>Synopsis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synopsis</em>' attribute.
	 * @see #getSynopsis()
	 * @generated
	 */
	void setSynopsis(String value);

	/**
	 * Returns the value of the '<em><b>Vendor Specific</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das SK-Objektmodell lässt nicht darstellungsrelevante Informationen unbeachtet. In praktischer Nutzung des Objektmodells via SK-XML kann "vendorSpecific" verwendet werden, um eine SK-Instanz bei Bedarf mit individuellen implementierungsspezifischen Informationen ("Tags") anzureichern. 
	 * 
	 * Die Verwendung und Bedeutung der Tags ist anwendungsspezifisch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor Specific</em>' containment reference.
	 * @see #setVendorSpecific(VendorSpecificType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getElementType1_VendorSpecific()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vendorSpecific' namespace='##targetNamespace'"
	 * @generated
	 */
	VendorSpecificType getVendorSpecific();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ElementType1#getVendorSpecific <em>Vendor Specific</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Specific</em>' containment reference.
	 * @see #getVendorSpecific()
	 * @generated
	 */
	void setVendorSpecific(VendorSpecificType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier des Objekts. Dieser muss eindeutig sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getElementType1_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ElementType1#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kurzname des Objekts.
	 * 
	 * Beispiel bei Color: "hellrot"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getElementType1_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ElementType1#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ElementType1
