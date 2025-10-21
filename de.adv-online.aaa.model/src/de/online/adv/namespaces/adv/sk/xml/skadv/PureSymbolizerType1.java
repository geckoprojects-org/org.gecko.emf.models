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

import java.math.BigInteger;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pure Symbolizer Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PureSymbolizerType1#getSignaturnummer <em>Signaturnummer</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PureSymbolizerType1#getZIndex <em>ZIndex</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPureSymbolizerType1()
 * @model abstract="true"
 *        extendedMetaData="name='PureSymbolizerType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PureSymbolizerType1 extends SymbolizerType1 {
	/**
	 * Returns the value of the '<em><b>Signaturnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Property "signaturnummer" dient zur Aufnahme der in den bisherigen Signaturkatalogen verwendeten Signaturnummern. Es stellt die Verbindung zu den Präsentationsobjekten her, welche auf die Signaturnummer Bezug nehmen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signaturnummer</em>' attribute.
	 * @see #setSignaturnummer(String)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPureSymbolizerType1_Signaturnummer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='signaturnummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSignaturnummer();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PureSymbolizerType1#getSignaturnummer <em>Signaturnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signaturnummer</em>' attribute.
	 * @see #getSignaturnummer()
	 * @generated
	 */
	void setSignaturnummer(String value);

	/**
	 * Returns the value of the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der zIndex steuert die Darstellungspriorität. Das Attribut muss für alle konkreten Symbolizer außer dem NullSymbolizer angegeben werden.
	 * 
	 * Die im Symbolizer verpflichtend anzugebende Darstellungpriorität kann bei Gebrauch des Symbolizers im Kontext eines Emit durch die dort angebbare Darstellungspriorität (ebenfalls zIndex) überschrieben werden.
	 * 
	 * Wird ein Präsentationsobjekt mittels des Symbolizers ausgegeben, so kommt die im Objekt vorhandene Darstellungspriorität zum Zuge, falls eine solche dort vorhanden ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZIndex</em>' attribute.
	 * @see #setZIndex(BigInteger)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPureSymbolizerType1_ZIndex()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='zIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getZIndex();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PureSymbolizerType1#getZIndex <em>ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZIndex</em>' attribute.
	 * @see #getZIndex()
	 * @generated
	 */
	void setZIndex(BigInteger value);

} // PureSymbolizerType1
