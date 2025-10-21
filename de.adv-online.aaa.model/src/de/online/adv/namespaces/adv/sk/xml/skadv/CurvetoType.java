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
 * A representation of the model object '<em><b>Curveto Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getX <em>X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getX1 <em>X1</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getX2 <em>X2</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getY <em>Y</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getY1 <em>Y1</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getY2 <em>Y2</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getCurvetoType()
 * @model extendedMetaData="name='CurvetoType' kind='empty'"
 * @generated
 */
@ProviderType
public interface CurvetoType extends PathElementType {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * x-Wert des Endpunkts der Bezierkurve.
	 * 
	 * Es handelt sich um einen Koordinatenwert bezüglich des Ursprungs der Symboldefinition in Einheiten, die durch "mapLengthFactor" vorgegeben sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #setX(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getCurvetoType_X()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='x'"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(double)
	 * @generated
	 */
	void unsetX();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getX <em>X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X</em>' attribute is set.
	 * @see #unsetX()
	 * @see #getX()
	 * @see #setX(double)
	 * @generated
	 */
	boolean isSetX();

	/**
	 * Returns the value of the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * x-Wert des Kontrollpunkts am laufenden Punkt.
	 * 
	 * Einheit ist durch "mapLengthFactor" vorgegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X1</em>' attribute.
	 * @see #isSetX1()
	 * @see #unsetX1()
	 * @see #setX1(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getCurvetoType_X1()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='x1'"
	 * @generated
	 */
	double getX1();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getX1 <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X1</em>' attribute.
	 * @see #isSetX1()
	 * @see #unsetX1()
	 * @see #getX1()
	 * @generated
	 */
	void setX1(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getX1 <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX1()
	 * @see #getX1()
	 * @see #setX1(double)
	 * @generated
	 */
	void unsetX1();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getX1 <em>X1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X1</em>' attribute is set.
	 * @see #unsetX1()
	 * @see #getX1()
	 * @see #setX1(double)
	 * @generated
	 */
	boolean isSetX1();

	/**
	 * Returns the value of the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * x-Wert des Kontrollpunkts am Endpunkt.
	 * 
	 * Einheit ist durch "mapLengthFactor" vorgegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X2</em>' attribute.
	 * @see #isSetX2()
	 * @see #unsetX2()
	 * @see #setX2(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getCurvetoType_X2()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='x2'"
	 * @generated
	 */
	double getX2();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getX2 <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X2</em>' attribute.
	 * @see #isSetX2()
	 * @see #unsetX2()
	 * @see #getX2()
	 * @generated
	 */
	void setX2(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getX2 <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX2()
	 * @see #getX2()
	 * @see #setX2(double)
	 * @generated
	 */
	void unsetX2();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getX2 <em>X2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X2</em>' attribute is set.
	 * @see #unsetX2()
	 * @see #getX2()
	 * @see #setX2(double)
	 * @generated
	 */
	boolean isSetX2();

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * y-Wert des Endpunkts der Bezierkurve.
	 * 
	 * Es handelt sich um einen Koordinatenwert bezüglich des Ursprungs der Symboldefinition in Einheiten, die durch "mapLengthFactor" vorgegeben sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #setY(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getCurvetoType_Y()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='y'"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY()
	 * @see #getY()
	 * @see #setY(double)
	 * @generated
	 */
	void unsetY();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getY <em>Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y</em>' attribute is set.
	 * @see #unsetY()
	 * @see #getY()
	 * @see #setY(double)
	 * @generated
	 */
	boolean isSetY();

	/**
	 * Returns the value of the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * x-Wert des Kontrollpunkts am laufenden Punkt.
	 * 
	 * Einheit ist durch "mapLengthFactor" vorgegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y1</em>' attribute.
	 * @see #isSetY1()
	 * @see #unsetY1()
	 * @see #setY1(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getCurvetoType_Y1()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='y1'"
	 * @generated
	 */
	double getY1();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getY1 <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y1</em>' attribute.
	 * @see #isSetY1()
	 * @see #unsetY1()
	 * @see #getY1()
	 * @generated
	 */
	void setY1(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getY1 <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY1()
	 * @see #getY1()
	 * @see #setY1(double)
	 * @generated
	 */
	void unsetY1();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getY1 <em>Y1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y1</em>' attribute is set.
	 * @see #unsetY1()
	 * @see #getY1()
	 * @see #setY1(double)
	 * @generated
	 */
	boolean isSetY1();

	/**
	 * Returns the value of the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * y-Wert des Kontrollpunkts am Endpunkt.
	 * 
	 * Einheit ist durch "mapLengthFactor" vorgegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y2</em>' attribute.
	 * @see #isSetY2()
	 * @see #unsetY2()
	 * @see #setY2(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getCurvetoType_Y2()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='y2'"
	 * @generated
	 */
	double getY2();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getY2 <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y2</em>' attribute.
	 * @see #isSetY2()
	 * @see #unsetY2()
	 * @see #getY2()
	 * @generated
	 */
	void setY2(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getY2 <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY2()
	 * @see #getY2()
	 * @see #setY2(double)
	 * @generated
	 */
	void unsetY2();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType#getY2 <em>Y2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y2</em>' attribute is set.
	 * @see #unsetY2()
	 * @see #getY2()
	 * @see #setY2(double)
	 * @generated
	 */
	boolean isSetY2();

} // CurvetoType
