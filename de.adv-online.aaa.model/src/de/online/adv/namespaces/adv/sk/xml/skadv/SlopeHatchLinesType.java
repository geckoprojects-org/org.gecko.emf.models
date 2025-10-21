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
 * A representation of the model object '<em><b>Slope Hatch Lines Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SlopeHatchLinesType#getSecondHatchLineFactor <em>Second Hatch Line Factor</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SlopeHatchLinesType#getHatchDistance <em>Hatch Distance</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SlopeHatchLinesType#getTopEdge <em>Top Edge</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SlopeHatchLinesType#getBottomEdge <em>Bottom Edge</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSlopeHatchLinesType()
 * @model extendedMetaData="name='SlopeHatchLinesType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SlopeHatchLinesType extends PlacementRuleType {
	/**
	 * Returns the value of the '<em><b>Second Hatch Line Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Faktor für die Verkürzung jeder zweiten Schraffe.
	 * 
	 * Die Verkürzung erfolgt durch Multiplikation der eigentlichen Länge (von Oberkante zu Unterkante verlaufend) mit "secondHatchLineFactor".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Second Hatch Line Factor</em>' attribute.
	 * @see #isSetSecondHatchLineFactor()
	 * @see #unsetSecondHatchLineFactor()
	 * @see #setSecondHatchLineFactor(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSlopeHatchLinesType_SecondHatchLineFactor()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='secondHatchLineFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	double getSecondHatchLineFactor();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SlopeHatchLinesType#getSecondHatchLineFactor <em>Second Hatch Line Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Hatch Line Factor</em>' attribute.
	 * @see #isSetSecondHatchLineFactor()
	 * @see #unsetSecondHatchLineFactor()
	 * @see #getSecondHatchLineFactor()
	 * @generated
	 */
	void setSecondHatchLineFactor(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SlopeHatchLinesType#getSecondHatchLineFactor <em>Second Hatch Line Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecondHatchLineFactor()
	 * @see #getSecondHatchLineFactor()
	 * @see #setSecondHatchLineFactor(double)
	 * @generated
	 */
	void unsetSecondHatchLineFactor();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SlopeHatchLinesType#getSecondHatchLineFactor <em>Second Hatch Line Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Second Hatch Line Factor</em>' attribute is set.
	 * @see #unsetSecondHatchLineFactor()
	 * @see #getSecondHatchLineFactor()
	 * @see #setSecondHatchLineFactor(double)
	 * @generated
	 */
	boolean isSetSecondHatchLineFactor();

	/**
	 * Returns the value of the '<em><b>Hatch Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimaldistanz der Böschungsschraffen an der Oberkante.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hatch Distance</em>' attribute.
	 * @see #isSetHatchDistance()
	 * @see #unsetHatchDistance()
	 * @see #setHatchDistance(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSlopeHatchLinesType_HatchDistance()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='hatchDistance' namespace='##targetNamespace'"
	 * @generated
	 */
	double getHatchDistance();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SlopeHatchLinesType#getHatchDistance <em>Hatch Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hatch Distance</em>' attribute.
	 * @see #isSetHatchDistance()
	 * @see #unsetHatchDistance()
	 * @see #getHatchDistance()
	 * @generated
	 */
	void setHatchDistance(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SlopeHatchLinesType#getHatchDistance <em>Hatch Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHatchDistance()
	 * @see #getHatchDistance()
	 * @see #setHatchDistance(double)
	 * @generated
	 */
	void unsetHatchDistance();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SlopeHatchLinesType#getHatchDistance <em>Hatch Distance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hatch Distance</em>' attribute is set.
	 * @see #unsetHatchDistance()
	 * @see #getHatchDistance()
	 * @see #setHatchDistance(double)
	 * @generated
	 */
	boolean isSetHatchDistance();

	/**
	 * Returns the value of the '<em><b>Top Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geometie der Oberkante für die Böschungsschraffur.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Top Edge</em>' containment reference.
	 * @see #setTopEdge(TopEdgeType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSlopeHatchLinesType_TopEdge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='topEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	TopEdgeType getTopEdge();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SlopeHatchLinesType#getTopEdge <em>Top Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Edge</em>' containment reference.
	 * @see #getTopEdge()
	 * @generated
	 */
	void setTopEdge(TopEdgeType value);

	/**
	 * Returns the value of the '<em><b>Bottom Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geometie der Unterkante für die Böschungsschraffur.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bottom Edge</em>' containment reference.
	 * @see #setBottomEdge(BottomEdgeType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSlopeHatchLinesType_BottomEdge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='bottomEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	BottomEdgeType getBottomEdge();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SlopeHatchLinesType#getBottomEdge <em>Bottom Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom Edge</em>' containment reference.
	 * @see #getBottomEdge()
	 * @generated
	 */
	void setBottomEdge(BottomEdgeType value);

} // SlopeHatchLinesType
