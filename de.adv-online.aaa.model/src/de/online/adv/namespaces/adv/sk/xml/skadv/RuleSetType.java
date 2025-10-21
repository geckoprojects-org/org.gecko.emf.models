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
 * A representation of the model object '<em><b>Rule Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetType#getMaxScaleDenominator <em>Max Scale Denominator</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetType#getMinScaleDenominator <em>Min Scale Denominator</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetType#getTargetScaleDenominator <em>Target Scale Denominator</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetType#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getRuleSetType()
 * @model extendedMetaData="name='RuleSetType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RuleSetType extends ElementType1 {
	/**
	 * Returns the value of the '<em><b>Max Scale Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Oberer Wert für die Maßstabsgrenze, für welche die enthaltenen Rules gelten sollen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Scale Denominator</em>' attribute.
	 * @see #isSetMaxScaleDenominator()
	 * @see #unsetMaxScaleDenominator()
	 * @see #setMaxScaleDenominator(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getRuleSetType_MaxScaleDenominator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='maxScaleDenominator' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaxScaleDenominator();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetType#getMaxScaleDenominator <em>Max Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Scale Denominator</em>' attribute.
	 * @see #isSetMaxScaleDenominator()
	 * @see #unsetMaxScaleDenominator()
	 * @see #getMaxScaleDenominator()
	 * @generated
	 */
	void setMaxScaleDenominator(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetType#getMaxScaleDenominator <em>Max Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxScaleDenominator()
	 * @see #getMaxScaleDenominator()
	 * @see #setMaxScaleDenominator(double)
	 * @generated
	 */
	void unsetMaxScaleDenominator();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetType#getMaxScaleDenominator <em>Max Scale Denominator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Scale Denominator</em>' attribute is set.
	 * @see #unsetMaxScaleDenominator()
	 * @see #getMaxScaleDenominator()
	 * @see #setMaxScaleDenominator(double)
	 * @generated
	 */
	boolean isSetMaxScaleDenominator();

	/**
	 * Returns the value of the '<em><b>Min Scale Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unterer Wert für die Maßstabsgrenze, für welche die enthaltenen Rules gelten sollen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Scale Denominator</em>' attribute.
	 * @see #isSetMinScaleDenominator()
	 * @see #unsetMinScaleDenominator()
	 * @see #setMinScaleDenominator(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getRuleSetType_MinScaleDenominator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='minScaleDenominator' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMinScaleDenominator();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetType#getMinScaleDenominator <em>Min Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Scale Denominator</em>' attribute.
	 * @see #isSetMinScaleDenominator()
	 * @see #unsetMinScaleDenominator()
	 * @see #getMinScaleDenominator()
	 * @generated
	 */
	void setMinScaleDenominator(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetType#getMinScaleDenominator <em>Min Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinScaleDenominator()
	 * @see #getMinScaleDenominator()
	 * @see #setMinScaleDenominator(double)
	 * @generated
	 */
	void unsetMinScaleDenominator();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetType#getMinScaleDenominator <em>Min Scale Denominator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Scale Denominator</em>' attribute is set.
	 * @see #unsetMinScaleDenominator()
	 * @see #getMinScaleDenominator()
	 * @see #setMinScaleDenominator(double)
	 * @generated
	 */
	boolean isSetMinScaleDenominator();

	/**
	 * Returns the value of the '<em><b>Target Scale Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Weglassen des optionalen Attributs targetScaleDenominator bewirkt, dass alle Längen- und Größenangaben in den im RuleSet enthaltenen Symbolizern für alle Maßstäbe so wie angegeben gemeint sind und im gesamten Maßstabsbereich konstant bleiben sollen.
	 * 
	 * Wird targetScaleDenominator angegeben, so bezeichnet das Attribut den Bezugsmaßstab, der für alle Längen- und Größenangaben der im RuleSet enthaltenen Symbolizer gelten soll. Für davon abweichende Maßstäbe werden die Längen- und Größenangaben entsprechend vergrößert, bzw. verkleinert.
	 * 
	 * Ist z.B. die Breite einer Signatur mit 5mm angegeben und ist targetScaleDenominator=50000, so würde die Ausgabe bei 1:50000 eine Breite von 5mm ergeben, während bei 1:25000 die Signatur 10mm breit würde.
	 * Ohne die Angabe von targetScaleDenominator wäre die Signatur für alle Maßstäbe 5mm breit.
	 * 
	 * targetScaleDenominator kann außerhalb des Maßstabsbereichs liegen, der durch minScaleDenominator und maxScaleDenominator gegeben ist. In diesem Fall werden die definierten Größen und Längen für keinen Maßstab erreicht, da das RuleSet außerhalb des Maßstabsbereichs nicht ausgegeben wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Scale Denominator</em>' attribute.
	 * @see #isSetTargetScaleDenominator()
	 * @see #unsetTargetScaleDenominator()
	 * @see #setTargetScaleDenominator(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getRuleSetType_TargetScaleDenominator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='targetScaleDenominator' namespace='##targetNamespace'"
	 * @generated
	 */
	double getTargetScaleDenominator();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetType#getTargetScaleDenominator <em>Target Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Scale Denominator</em>' attribute.
	 * @see #isSetTargetScaleDenominator()
	 * @see #unsetTargetScaleDenominator()
	 * @see #getTargetScaleDenominator()
	 * @generated
	 */
	void setTargetScaleDenominator(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetType#getTargetScaleDenominator <em>Target Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTargetScaleDenominator()
	 * @see #getTargetScaleDenominator()
	 * @see #setTargetScaleDenominator(double)
	 * @generated
	 */
	void unsetTargetScaleDenominator();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetType#getTargetScaleDenominator <em>Target Scale Denominator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target Scale Denominator</em>' attribute is set.
	 * @see #unsetTargetScaleDenominator()
	 * @see #getTargetScaleDenominator()
	 * @see #setTargetScaleDenominator(double)
	 * @generated
	 */
	boolean isSetTargetScaleDenominator();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rule eines RuleSet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getRuleSetType_Rule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rule' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RuleType1> getRule();

} // RuleSetType
