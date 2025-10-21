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
 * A representation of the model object '<em><b>Circular Arc Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.CircularArcType#getX <em>X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.CircularArcType#getXa <em>Xa</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.CircularArcType#getY <em>Y</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.CircularArcType#getYa <em>Ya</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getCircularArcType()
 * @model extendedMetaData="name='CircularArcType' kind='empty'"
 * @generated
 */
@ProviderType
public interface CircularArcType extends PathElementType {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * x-Wert des Endpunkts des Kreisbogens.
	 * 
	 * Es handelt sich um einen Koordinatenwert bezüglich des Ursprungs der Symboldefinition in Einheiten, die durch "mapLengthFactor" vorgegeben sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #setX(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getCircularArcType_X()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='x'"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CircularArcType#getX <em>X</em>}' attribute.
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
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CircularArcType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(double)
	 * @generated
	 */
	void unsetX();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CircularArcType#getX <em>X</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Xa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * x-Wert eines beliebigen Punktes auf dem Kreisbogen, zwischen dem laufenden Punkt und dem Endpunkt liegend. Beim Vollkreis ist es Punkt diametral zum in diesem Falle zusammenfallenden laufenden Punkt und Endpunkt.
	 * 
	 * Es handelt sich um einen Koordinatenwert bezüglich des Ursprungs der Symboldefinition in Einheiten, die durch "mapLengthFactor" vorgegeben sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xa</em>' attribute.
	 * @see #isSetXa()
	 * @see #unsetXa()
	 * @see #setXa(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getCircularArcType_Xa()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='xa'"
	 * @generated
	 */
	double getXa();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CircularArcType#getXa <em>Xa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xa</em>' attribute.
	 * @see #isSetXa()
	 * @see #unsetXa()
	 * @see #getXa()
	 * @generated
	 */
	void setXa(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CircularArcType#getXa <em>Xa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXa()
	 * @see #getXa()
	 * @see #setXa(double)
	 * @generated
	 */
	void unsetXa();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CircularArcType#getXa <em>Xa</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Xa</em>' attribute is set.
	 * @see #unsetXa()
	 * @see #getXa()
	 * @see #setXa(double)
	 * @generated
	 */
	boolean isSetXa();

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * x-Wert des Endpunkts des Kreisbogens.
	 * 
	 * Es handelt sich um einen Koordinatenwert bezüglich des Ursprungs der Symboldefinition in Einheiten, die durch "mapLengthFactor" vorgegeben sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #setY(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getCircularArcType_Y()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='y'"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CircularArcType#getY <em>Y</em>}' attribute.
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
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CircularArcType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY()
	 * @see #getY()
	 * @see #setY(double)
	 * @generated
	 */
	void unsetY();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CircularArcType#getY <em>Y</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Ya</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * y-Wert eines beliebigen Punktes auf dem Kreisbogen, zwischen dem laufenden Punkt und dem Endpunkt liegend. Beim Vollkreis ist es Punkt diametral zum in diesem Falle zusammenfallenden laufenden Punkt und Endpunkt.
	 * 
	 * Es handelt sich um einen Koordinatenwert bezüglich des Ursprungs der Symboldefinition in Einheiten, die durch "mapLengthFactor" vorgegeben sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ya</em>' attribute.
	 * @see #isSetYa()
	 * @see #unsetYa()
	 * @see #setYa(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getCircularArcType_Ya()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='ya'"
	 * @generated
	 */
	double getYa();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CircularArcType#getYa <em>Ya</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ya</em>' attribute.
	 * @see #isSetYa()
	 * @see #unsetYa()
	 * @see #getYa()
	 * @generated
	 */
	void setYa(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CircularArcType#getYa <em>Ya</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYa()
	 * @see #getYa()
	 * @see #setYa(double)
	 * @generated
	 */
	void unsetYa();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CircularArcType#getYa <em>Ya</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ya</em>' attribute is set.
	 * @see #unsetYa()
	 * @see #getYa()
	 * @see #setYa(double)
	 * @generated
	 */
	boolean isSetYa();

} // CircularArcType
