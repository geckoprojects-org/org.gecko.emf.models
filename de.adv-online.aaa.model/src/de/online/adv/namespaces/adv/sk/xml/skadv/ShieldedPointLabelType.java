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
 * A representation of the model object '<em><b>Shielded Point Label Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getBoxEnlargementLeft <em>Box Enlargement Left</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getBoxEnlargementRight <em>Box Enlargement Right</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getBoxEnlargementTop <em>Box Enlargement Top</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getBoxEnlargementBottom <em>Box Enlargement Bottom</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getRoundedCornerRadius <em>Rounded Corner Radius</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getBackgroundFill <em>Background Fill</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getBackgroundBorder <em>Background Border</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getShieldedPointLabelType()
 * @model extendedMetaData="name='ShieldedPointLabelType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ShieldedPointLabelType extends PointLabelType {
	/**
	 * Returns the value of the '<em><b>Box Enlargement Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vergrößerung der Hintergrundbox in der durch "mapLengthFactor" vorgegebenen Einheit (Default: mm/100)
	 * nach links in Schreibrichtung.
	 * 
	 * Default ist 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Box Enlargement Left</em>' attribute.
	 * @see #isSetBoxEnlargementLeft()
	 * @see #unsetBoxEnlargementLeft()
	 * @see #setBoxEnlargementLeft(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getShieldedPointLabelType_BoxEnlargementLeft()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='boxEnlargementLeft' namespace='##targetNamespace'"
	 * @generated
	 */
	double getBoxEnlargementLeft();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getBoxEnlargementLeft <em>Box Enlargement Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Enlargement Left</em>' attribute.
	 * @see #isSetBoxEnlargementLeft()
	 * @see #unsetBoxEnlargementLeft()
	 * @see #getBoxEnlargementLeft()
	 * @generated
	 */
	void setBoxEnlargementLeft(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getBoxEnlargementLeft <em>Box Enlargement Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoxEnlargementLeft()
	 * @see #getBoxEnlargementLeft()
	 * @see #setBoxEnlargementLeft(double)
	 * @generated
	 */
	void unsetBoxEnlargementLeft();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getBoxEnlargementLeft <em>Box Enlargement Left</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Box Enlargement Left</em>' attribute is set.
	 * @see #unsetBoxEnlargementLeft()
	 * @see #getBoxEnlargementLeft()
	 * @see #setBoxEnlargementLeft(double)
	 * @generated
	 */
	boolean isSetBoxEnlargementLeft();

	/**
	 * Returns the value of the '<em><b>Box Enlargement Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vergrößerung der Hintergrundbox in der durch "mapLengthFactor" vorgegebenen Einheit (Default: mm/100)
	 * nach rechts in Schreibrichtung.
	 * 
	 * Default ist 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Box Enlargement Right</em>' attribute.
	 * @see #isSetBoxEnlargementRight()
	 * @see #unsetBoxEnlargementRight()
	 * @see #setBoxEnlargementRight(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getShieldedPointLabelType_BoxEnlargementRight()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='boxEnlargementRight' namespace='##targetNamespace'"
	 * @generated
	 */
	double getBoxEnlargementRight();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getBoxEnlargementRight <em>Box Enlargement Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Enlargement Right</em>' attribute.
	 * @see #isSetBoxEnlargementRight()
	 * @see #unsetBoxEnlargementRight()
	 * @see #getBoxEnlargementRight()
	 * @generated
	 */
	void setBoxEnlargementRight(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getBoxEnlargementRight <em>Box Enlargement Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoxEnlargementRight()
	 * @see #getBoxEnlargementRight()
	 * @see #setBoxEnlargementRight(double)
	 * @generated
	 */
	void unsetBoxEnlargementRight();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getBoxEnlargementRight <em>Box Enlargement Right</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Box Enlargement Right</em>' attribute is set.
	 * @see #unsetBoxEnlargementRight()
	 * @see #getBoxEnlargementRight()
	 * @see #setBoxEnlargementRight(double)
	 * @generated
	 */
	boolean isSetBoxEnlargementRight();

	/**
	 * Returns the value of the '<em><b>Box Enlargement Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vergrößerung der Hintergrundbox in der durch "mapLengthFactor" vorgegebenen Einheit (Default: mm/100)
	 * nach oben in Schreibrichtung.
	 * 
	 * Default ist 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Box Enlargement Top</em>' attribute.
	 * @see #isSetBoxEnlargementTop()
	 * @see #unsetBoxEnlargementTop()
	 * @see #setBoxEnlargementTop(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getShieldedPointLabelType_BoxEnlargementTop()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='boxEnlargementTop' namespace='##targetNamespace'"
	 * @generated
	 */
	double getBoxEnlargementTop();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getBoxEnlargementTop <em>Box Enlargement Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Enlargement Top</em>' attribute.
	 * @see #isSetBoxEnlargementTop()
	 * @see #unsetBoxEnlargementTop()
	 * @see #getBoxEnlargementTop()
	 * @generated
	 */
	void setBoxEnlargementTop(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getBoxEnlargementTop <em>Box Enlargement Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoxEnlargementTop()
	 * @see #getBoxEnlargementTop()
	 * @see #setBoxEnlargementTop(double)
	 * @generated
	 */
	void unsetBoxEnlargementTop();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getBoxEnlargementTop <em>Box Enlargement Top</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Box Enlargement Top</em>' attribute is set.
	 * @see #unsetBoxEnlargementTop()
	 * @see #getBoxEnlargementTop()
	 * @see #setBoxEnlargementTop(double)
	 * @generated
	 */
	boolean isSetBoxEnlargementTop();

	/**
	 * Returns the value of the '<em><b>Box Enlargement Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vergrößerung der Hintergrundbox in der durch "mapLengthFactor" vorgegebenen Einheit (Default: mm/100)
	 * nach unten in Schreibrichtung.
	 * 
	 * Default ist 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Box Enlargement Bottom</em>' attribute.
	 * @see #isSetBoxEnlargementBottom()
	 * @see #unsetBoxEnlargementBottom()
	 * @see #setBoxEnlargementBottom(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getShieldedPointLabelType_BoxEnlargementBottom()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='boxEnlargementBottom' namespace='##targetNamespace'"
	 * @generated
	 */
	double getBoxEnlargementBottom();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getBoxEnlargementBottom <em>Box Enlargement Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Enlargement Bottom</em>' attribute.
	 * @see #isSetBoxEnlargementBottom()
	 * @see #unsetBoxEnlargementBottom()
	 * @see #getBoxEnlargementBottom()
	 * @generated
	 */
	void setBoxEnlargementBottom(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getBoxEnlargementBottom <em>Box Enlargement Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoxEnlargementBottom()
	 * @see #getBoxEnlargementBottom()
	 * @see #setBoxEnlargementBottom(double)
	 * @generated
	 */
	void unsetBoxEnlargementBottom();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getBoxEnlargementBottom <em>Box Enlargement Bottom</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Box Enlargement Bottom</em>' attribute is set.
	 * @see #unsetBoxEnlargementBottom()
	 * @see #getBoxEnlargementBottom()
	 * @see #setBoxEnlargementBottom(double)
	 * @generated
	 */
	boolean isSetBoxEnlargementBottom();

	/**
	 * Returns the value of the '<em><b>Rounded Corner Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Radius für abgerundete Ecken.  Die Semantik ist analog zu SVG "rect rx=...". Unterschiedliche Radien in X und Y sind nicht zugelassen, d.h. es handelt sich immer um Viertelkreise.
	 * 
	 * Die Angabe erfolgt in der durch "mapLengthFactor" vorgegebenen Einheit (Default: mm/100)
	 * 
	 * Default ist 0, was "ohne Rundung" bedeutet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rounded Corner Radius</em>' attribute.
	 * @see #isSetRoundedCornerRadius()
	 * @see #unsetRoundedCornerRadius()
	 * @see #setRoundedCornerRadius(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getShieldedPointLabelType_RoundedCornerRadius()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='roundedCornerRadius' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRoundedCornerRadius();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getRoundedCornerRadius <em>Rounded Corner Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rounded Corner Radius</em>' attribute.
	 * @see #isSetRoundedCornerRadius()
	 * @see #unsetRoundedCornerRadius()
	 * @see #getRoundedCornerRadius()
	 * @generated
	 */
	void setRoundedCornerRadius(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getRoundedCornerRadius <em>Rounded Corner Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRoundedCornerRadius()
	 * @see #getRoundedCornerRadius()
	 * @see #setRoundedCornerRadius(double)
	 * @generated
	 */
	void unsetRoundedCornerRadius();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getRoundedCornerRadius <em>Rounded Corner Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rounded Corner Radius</em>' attribute is set.
	 * @see #unsetRoundedCornerRadius()
	 * @see #getRoundedCornerRadius()
	 * @see #setRoundedCornerRadius(double)
	 * @generated
	 */
	boolean isSetRoundedCornerRadius();

	/**
	 * Returns the value of the '<em><b>Background Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SolidFill-Objekt für das Innere der Background-Box eines ShieldedPointLabel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Background Fill</em>' containment reference.
	 * @see #setBackgroundFill(BackgroundFillType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getShieldedPointLabelType_BackgroundFill()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='backgroundFill' namespace='##targetNamespace'"
	 * @generated
	 */
	BackgroundFillType getBackgroundFill();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getBackgroundFill <em>Background Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Fill</em>' containment reference.
	 * @see #getBackgroundFill()
	 * @generated
	 */
	void setBackgroundFill(BackgroundFillType value);

	/**
	 * Returns the value of the '<em><b>Background Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stroke-Objekt zur Ausgestaltung des Rands einer Background-Box.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Background Border</em>' containment reference.
	 * @see #setBackgroundBorder(BackgroundBorderType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getShieldedPointLabelType_BackgroundBorder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='backgroundBorder' namespace='##targetNamespace'"
	 * @generated
	 */
	BackgroundBorderType getBackgroundBorder();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType#getBackgroundBorder <em>Background Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Border</em>' containment reference.
	 * @see #getBackgroundBorder()
	 * @generated
	 */
	void setBackgroundBorder(BackgroundBorderType value);

} // ShieldedPointLabelType
