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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LayerType1#getStyle <em>Style</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LayerType1#getRuleSet <em>Rule Set</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LayerType1#getAdditionalSymbolizers <em>Additional Symbolizers</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLayerType1()
 * @model extendedMetaData="name='LayerType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LayerType1 extends ElementType1 {
	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference list.
	 * The list contents are of type {@link de.online.adv.namespaces.adv.sk.xml.skadv.StyleType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Style eines Layers. 
	 * 
	 * Es ist nicht erforderlich, Styles zu definieren.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style</em>' containment reference list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLayerType1_Style()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='style' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StyleType1> getStyle();

	/**
	 * Returns the value of the '<em><b>Rule Set</b></em>' containment reference list.
	 * The list contents are of type {@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein RuleSet eines Layer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule Set</em>' containment reference list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLayerType1_RuleSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ruleSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RuleSetType1> getRuleSet();

	/**
	 * Returns the value of the '<em><b>Additional Symbolizers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diese Rolle bindet optional ein AdditionalSymbolizer-Objekt an den Layer an. Dieser dient als Behälter für sogenannte "freie Symbolizer".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Symbolizers</em>' containment reference.
	 * @see #setAdditionalSymbolizers(AdditionalSymbolizersType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLayerType1_AdditionalSymbolizers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalSymbolizers' namespace='##targetNamespace'"
	 * @generated
	 */
	AdditionalSymbolizersType getAdditionalSymbolizers();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LayerType1#getAdditionalSymbolizers <em>Additional Symbolizers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Symbolizers</em>' containment reference.
	 * @see #getAdditionalSymbolizers()
	 * @generated
	 */
	void setAdditionalSymbolizers(AdditionalSymbolizersType value);

} // LayerType1
