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

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Points On Line Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType#getPattern <em>Pattern</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType#getRelativeRotation <em>Relative Rotation</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType#getAdjustment <em>Adjustment</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType#getPreGap <em>Pre Gap</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType#getPostGap <em>Post Gap</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPointsOnLineType()
 * @model extendedMetaData="name='PointsOnLineType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PointsOnLineType extends PlacementRuleType {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Muster für die Punktplatzierung: Ein Wert von 0.0 steht für ein Symbol, Werte >0 geben den Abstand zum nächsten Eintrag vor.
	 * 
	 * "pattern" wird im SK-XML als Liste dargestellt und nicht durch ein multipel auftretendes Property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(List)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPointsOnLineType_Pattern()
	 * @model dataType="de.online.adv.namespaces.adv.sk.xml.skadv.PatternType" required="true" many="false"
	 *        extendedMetaData="kind='element' name='pattern' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Double> getPattern();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(List<Double> value);

	/**
	 * Returns the value of the '<em><b>Relative Rotation</b></em>' attribute.
	 * The literals are from the enumeration {@link de.online.adv.namespaces.adv.sk.xml.skadv.RelativeRotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Durch das Property "relativeRotation" wird die relative Drehung des Punkts zur Linie gesteuert. Fehlt das Property, so wird der Wert "none" angenommen.
	 * 
	 * Zur Bedeutung siehe die Beschreibung bei RelativeRotation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Rotation</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.RelativeRotationType
	 * @see #isSetRelativeRotation()
	 * @see #unsetRelativeRotation()
	 * @see #setRelativeRotation(RelativeRotationType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPointsOnLineType_RelativeRotation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='relativeRotation' namespace='##targetNamespace'"
	 * @generated
	 */
	RelativeRotationType getRelativeRotation();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType#getRelativeRotation <em>Relative Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Rotation</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.RelativeRotationType
	 * @see #isSetRelativeRotation()
	 * @see #unsetRelativeRotation()
	 * @see #getRelativeRotation()
	 * @generated
	 */
	void setRelativeRotation(RelativeRotationType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType#getRelativeRotation <em>Relative Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelativeRotation()
	 * @see #getRelativeRotation()
	 * @see #setRelativeRotation(RelativeRotationType)
	 * @generated
	 */
	void unsetRelativeRotation();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType#getRelativeRotation <em>Relative Rotation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relative Rotation</em>' attribute is set.
	 * @see #unsetRelativeRotation()
	 * @see #getRelativeRotation()
	 * @see #setRelativeRotation(RelativeRotationType)
	 * @generated
	 */
	boolean isSetRelativeRotation();

	/**
	 * Returns the value of the '<em><b>Adjustment</b></em>' attribute.
	 * The literals are from the enumeration {@link de.online.adv.namespaces.adv.sk.xml.skadv.AdjustmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Duch "adjustment" kann der Ausgleich des Musters in der Gesamtgeometrie (ohne die Lücken am Anfang und Ende) gefordert werden.
	 * 
	 * Um den Ausgleich herzustellen, werden die Lücken gleichmäßig verlängert bzw. verkürzt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adjustment</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AdjustmentType
	 * @see #isSetAdjustment()
	 * @see #unsetAdjustment()
	 * @see #setAdjustment(AdjustmentType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPointsOnLineType_Adjustment()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='adjustment' namespace='##targetNamespace'"
	 * @generated
	 */
	AdjustmentType getAdjustment();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType#getAdjustment <em>Adjustment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjustment</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AdjustmentType
	 * @see #isSetAdjustment()
	 * @see #unsetAdjustment()
	 * @see #getAdjustment()
	 * @generated
	 */
	void setAdjustment(AdjustmentType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType#getAdjustment <em>Adjustment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAdjustment()
	 * @see #getAdjustment()
	 * @see #setAdjustment(AdjustmentType)
	 * @generated
	 */
	void unsetAdjustment();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType#getAdjustment <em>Adjustment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Adjustment</em>' attribute is set.
	 * @see #unsetAdjustment()
	 * @see #getAdjustment()
	 * @see #setAdjustment(AdjustmentType)
	 * @generated
	 */
	boolean isSetAdjustment();

	/**
	 * Returns the value of the '<em><b>Pre Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lücke am Anfang der Linie, Angabe in Einheiten des "mapLengthFactor".
	 * 
	 * Default: Ohne Lücke.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Gap</em>' attribute.
	 * @see #isSetPreGap()
	 * @see #unsetPreGap()
	 * @see #setPreGap(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPointsOnLineType_PreGap()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='preGap' namespace='##targetNamespace'"
	 * @generated
	 */
	double getPreGap();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType#getPreGap <em>Pre Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Gap</em>' attribute.
	 * @see #isSetPreGap()
	 * @see #unsetPreGap()
	 * @see #getPreGap()
	 * @generated
	 */
	void setPreGap(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType#getPreGap <em>Pre Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreGap()
	 * @see #getPreGap()
	 * @see #setPreGap(double)
	 * @generated
	 */
	void unsetPreGap();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType#getPreGap <em>Pre Gap</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pre Gap</em>' attribute is set.
	 * @see #unsetPreGap()
	 * @see #getPreGap()
	 * @see #setPreGap(double)
	 * @generated
	 */
	boolean isSetPreGap();

	/**
	 * Returns the value of the '<em><b>Post Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lücke am Ende der Linie, Angabe in Einheiten des "mapLengthFactor".
	 * 
	 * Default: Ohne Lücke.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Gap</em>' attribute.
	 * @see #isSetPostGap()
	 * @see #unsetPostGap()
	 * @see #setPostGap(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPointsOnLineType_PostGap()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='postGap' namespace='##targetNamespace'"
	 * @generated
	 */
	double getPostGap();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType#getPostGap <em>Post Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Gap</em>' attribute.
	 * @see #isSetPostGap()
	 * @see #unsetPostGap()
	 * @see #getPostGap()
	 * @generated
	 */
	void setPostGap(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType#getPostGap <em>Post Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPostGap()
	 * @see #getPostGap()
	 * @see #setPostGap(double)
	 * @generated
	 */
	void unsetPostGap();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType#getPostGap <em>Post Gap</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Post Gap</em>' attribute is set.
	 * @see #unsetPostGap()
	 * @see #getPostGap()
	 * @see #setPostGap(double)
	 * @generated
	 */
	boolean isSetPostGap();

} // PointsOnLineType
