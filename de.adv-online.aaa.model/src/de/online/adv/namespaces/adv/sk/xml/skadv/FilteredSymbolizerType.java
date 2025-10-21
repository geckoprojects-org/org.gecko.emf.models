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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filtered Symbolizer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilteredSymbolizerType#getSymbolizerPredicate <em>Symbolizer Predicate</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilteredSymbolizerType#getPureSymbolizer <em>Pure Symbolizer</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getFilteredSymbolizerType()
 * @model extendedMetaData="name='FilteredSymbolizerType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FilteredSymbolizerType extends SymbolizerType1 {
	/**
	 * Returns the value of the '<em><b>Symbolizer Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der logische Ausdruck legt fest, ob der Symbolizer für die Ausgabe herangezogen wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symbolizer Predicate</em>' containment reference.
	 * @see #setSymbolizerPredicate(SymbolizerPredicateType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getFilteredSymbolizerType_SymbolizerPredicate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='symbolizerPredicate' namespace='##targetNamespace'"
	 * @generated
	 */
	SymbolizerPredicateType getSymbolizerPredicate();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilteredSymbolizerType#getSymbolizerPredicate <em>Symbolizer Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbolizer Predicate</em>' containment reference.
	 * @see #getSymbolizerPredicate()
	 * @generated
	 */
	void setSymbolizerPredicate(SymbolizerPredicateType value);

	/**
	 * Returns the value of the '<em><b>Pure Symbolizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Referenz auf ein Objekt der abstrakten Klasse PureSymbolizer, welcher für eine der konkreten Symbolizer-Klassen (ohne Filterung) steht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pure Symbolizer</em>' containment reference.
	 * @see #setPureSymbolizer(PureSymbolizerType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getFilteredSymbolizerType_PureSymbolizer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pureSymbolizer' namespace='##targetNamespace'"
	 * @generated
	 */
	PureSymbolizerType getPureSymbolizer();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilteredSymbolizerType#getPureSymbolizer <em>Pure Symbolizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pure Symbolizer</em>' containment reference.
	 * @see #getPureSymbolizer()
	 * @generated
	 */
	void setPureSymbolizer(PureSymbolizerType value);

} // FilteredSymbolizerType
