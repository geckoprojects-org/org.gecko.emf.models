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
 * A representation of the model object '<em><b>Additional Symbolizers Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.AdditionalSymbolizersType#getAdditionalSymbolizers <em>Additional Symbolizers</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getAdditionalSymbolizersType()
 * @model extendedMetaData="name='additionalSymbolizers_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AdditionalSymbolizersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Additional Symbolizers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dies ist ein Behälter für zusätzliche Symbolizer (PureSymbolizers), welche zum Layer gehören, aber nicht direkt über Emits angesprochen werden. Dadurch, dass diese sog. freien Symbolizer in AdditionalSymbolizers angebunden sind, wird es möglich, sie über das SK-XML-Encoding zu transportieren.
	 * 
	 * Beispiele für die Verwendung solcher freier Symbolizer sind solche,  die nur implizit durch Präsentationsobjekte angesprochen werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Symbolizers</em>' containment reference.
	 * @see #setAdditionalSymbolizers(AdditionalSymbolizersType1)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getAdditionalSymbolizersType_AdditionalSymbolizers()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AdditionalSymbolizers' namespace='##targetNamespace'"
	 * @generated
	 */
	AdditionalSymbolizersType1 getAdditionalSymbolizers();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.AdditionalSymbolizersType#getAdditionalSymbolizers <em>Additional Symbolizers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Symbolizers</em>' containment reference.
	 * @see #getAdditionalSymbolizers()
	 * @generated
	 */
	void setAdditionalSymbolizers(AdditionalSymbolizersType1 value);

} // AdditionalSymbolizersType
