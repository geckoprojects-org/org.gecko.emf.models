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
 * A representation of the model object '<em><b>Hatch Lines Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getOriginX <em>Origin X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getOriginY <em>Origin Y</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getHatchRayDirectionX <em>Hatch Ray Direction X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getHatchRayDirectionY <em>Hatch Ray Direction Y</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getHatchDisplacementDirectionX <em>Hatch Displacement Direction X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getHatchDisplacementDirectionY <em>Hatch Displacement Direction Y</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getHatchDisplacementOffset <em>Hatch Displacement Offset</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getHatchLinesType()
 * @model extendedMetaData="name='HatchLinesType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HatchLinesType extends PlacementRuleType {
	/**
	 * Returns the value of the '<em><b>Origin X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X-Wert des Schraffenursprungs. 
	 * 
	 * Defaultwert ist noch festzulegen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin X</em>' attribute.
	 * @see #isSetOriginX()
	 * @see #unsetOriginX()
	 * @see #setOriginX(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getHatchLinesType_OriginX()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='originX' namespace='##targetNamespace'"
	 * @generated
	 */
	double getOriginX();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getOriginX <em>Origin X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin X</em>' attribute.
	 * @see #isSetOriginX()
	 * @see #unsetOriginX()
	 * @see #getOriginX()
	 * @generated
	 */
	void setOriginX(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getOriginX <em>Origin X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOriginX()
	 * @see #getOriginX()
	 * @see #setOriginX(double)
	 * @generated
	 */
	void unsetOriginX();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getOriginX <em>Origin X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Origin X</em>' attribute is set.
	 * @see #unsetOriginX()
	 * @see #getOriginX()
	 * @see #setOriginX(double)
	 * @generated
	 */
	boolean isSetOriginX();

	/**
	 * Returns the value of the '<em><b>Origin Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Y-Wert des Schraffenursprungs. 
	 * 
	 * Defaultwert ist noch festzulegen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin Y</em>' attribute.
	 * @see #isSetOriginY()
	 * @see #unsetOriginY()
	 * @see #setOriginY(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getHatchLinesType_OriginY()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='originY' namespace='##targetNamespace'"
	 * @generated
	 */
	double getOriginY();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getOriginY <em>Origin Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Y</em>' attribute.
	 * @see #isSetOriginY()
	 * @see #unsetOriginY()
	 * @see #getOriginY()
	 * @generated
	 */
	void setOriginY(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getOriginY <em>Origin Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOriginY()
	 * @see #getOriginY()
	 * @see #setOriginY(double)
	 * @generated
	 */
	void unsetOriginY();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getOriginY <em>Origin Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Origin Y</em>' attribute is set.
	 * @see #unsetOriginY()
	 * @see #getOriginY()
	 * @see #setOriginY(double)
	 * @generated
	 */
	boolean isSetOriginY();

	/**
	 * Returns the value of the '<em><b>Hatch Ray Direction X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X-Wert des Vektors, der die Schraffenrichtung angibt. Defaultwert ist 1. 
	 * 
	 * Die Länge des Vektors ist irrelevant.
	 * 
	 * Die Schraffe erstreckt sich auch in die negative Richtung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hatch Ray Direction X</em>' attribute.
	 * @see #isSetHatchRayDirectionX()
	 * @see #unsetHatchRayDirectionX()
	 * @see #setHatchRayDirectionX(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getHatchLinesType_HatchRayDirectionX()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='hatchRayDirectionX' namespace='##targetNamespace'"
	 * @generated
	 */
	double getHatchRayDirectionX();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getHatchRayDirectionX <em>Hatch Ray Direction X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hatch Ray Direction X</em>' attribute.
	 * @see #isSetHatchRayDirectionX()
	 * @see #unsetHatchRayDirectionX()
	 * @see #getHatchRayDirectionX()
	 * @generated
	 */
	void setHatchRayDirectionX(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getHatchRayDirectionX <em>Hatch Ray Direction X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHatchRayDirectionX()
	 * @see #getHatchRayDirectionX()
	 * @see #setHatchRayDirectionX(double)
	 * @generated
	 */
	void unsetHatchRayDirectionX();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getHatchRayDirectionX <em>Hatch Ray Direction X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hatch Ray Direction X</em>' attribute is set.
	 * @see #unsetHatchRayDirectionX()
	 * @see #getHatchRayDirectionX()
	 * @see #setHatchRayDirectionX(double)
	 * @generated
	 */
	boolean isSetHatchRayDirectionX();

	/**
	 * Returns the value of the '<em><b>Hatch Ray Direction Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Y-Wert des Vektors, der die Schraffenrichtung angibt. Defaultwert ist 0. 
	 * 
	 * Die Länge des Vektors ist irrelevant.
	 * 
	 * Die Schraffe erstreckt sich auch in die negative Richtung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hatch Ray Direction Y</em>' attribute.
	 * @see #isSetHatchRayDirectionY()
	 * @see #unsetHatchRayDirectionY()
	 * @see #setHatchRayDirectionY(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getHatchLinesType_HatchRayDirectionY()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='hatchRayDirectionY' namespace='##targetNamespace'"
	 * @generated
	 */
	double getHatchRayDirectionY();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getHatchRayDirectionY <em>Hatch Ray Direction Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hatch Ray Direction Y</em>' attribute.
	 * @see #isSetHatchRayDirectionY()
	 * @see #unsetHatchRayDirectionY()
	 * @see #getHatchRayDirectionY()
	 * @generated
	 */
	void setHatchRayDirectionY(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getHatchRayDirectionY <em>Hatch Ray Direction Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHatchRayDirectionY()
	 * @see #getHatchRayDirectionY()
	 * @see #setHatchRayDirectionY(double)
	 * @generated
	 */
	void unsetHatchRayDirectionY();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getHatchRayDirectionY <em>Hatch Ray Direction Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hatch Ray Direction Y</em>' attribute is set.
	 * @see #unsetHatchRayDirectionY()
	 * @see #getHatchRayDirectionY()
	 * @see #setHatchRayDirectionY(double)
	 * @generated
	 */
	boolean isSetHatchRayDirectionY();

	/**
	 * Returns the value of the '<em><b>Hatch Displacement Direction X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X-Wert des Vektors, der die Richtung zum Bezugspunkt der nächsten Schraffe definiert.
	 * 
	 * Die Länge des Vektors ist irrelevant.
	 * 
	 * Defaultwert ist der X-Wert der Normalen des "hatchRayDirection"-Vektors, also der negativ genommene Wert von "hatchRayDirectionY".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hatch Displacement Direction X</em>' attribute.
	 * @see #isSetHatchDisplacementDirectionX()
	 * @see #unsetHatchDisplacementDirectionX()
	 * @see #setHatchDisplacementDirectionX(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getHatchLinesType_HatchDisplacementDirectionX()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='hatchDisplacementDirectionX' namespace='##targetNamespace'"
	 * @generated
	 */
	double getHatchDisplacementDirectionX();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getHatchDisplacementDirectionX <em>Hatch Displacement Direction X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hatch Displacement Direction X</em>' attribute.
	 * @see #isSetHatchDisplacementDirectionX()
	 * @see #unsetHatchDisplacementDirectionX()
	 * @see #getHatchDisplacementDirectionX()
	 * @generated
	 */
	void setHatchDisplacementDirectionX(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getHatchDisplacementDirectionX <em>Hatch Displacement Direction X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHatchDisplacementDirectionX()
	 * @see #getHatchDisplacementDirectionX()
	 * @see #setHatchDisplacementDirectionX(double)
	 * @generated
	 */
	void unsetHatchDisplacementDirectionX();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getHatchDisplacementDirectionX <em>Hatch Displacement Direction X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hatch Displacement Direction X</em>' attribute is set.
	 * @see #unsetHatchDisplacementDirectionX()
	 * @see #getHatchDisplacementDirectionX()
	 * @see #setHatchDisplacementDirectionX(double)
	 * @generated
	 */
	boolean isSetHatchDisplacementDirectionX();

	/**
	 * Returns the value of the '<em><b>Hatch Displacement Direction Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Y-Wert des Vektors, der die Richtung zum Bezugspunkt der nächsten Schraffe definiert.
	 * 
	 * Die Länge des Vektors ist irrelevant.
	 * 
	 * Defaultwert ist der Y-Wert der Normalen des "hatchRayDirection"-Vektors, also der Wert von "hatchRayDirectionX".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hatch Displacement Direction Y</em>' attribute.
	 * @see #isSetHatchDisplacementDirectionY()
	 * @see #unsetHatchDisplacementDirectionY()
	 * @see #setHatchDisplacementDirectionY(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getHatchLinesType_HatchDisplacementDirectionY()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='hatchDisplacementDirectionY' namespace='##targetNamespace'"
	 * @generated
	 */
	double getHatchDisplacementDirectionY();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getHatchDisplacementDirectionY <em>Hatch Displacement Direction Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hatch Displacement Direction Y</em>' attribute.
	 * @see #isSetHatchDisplacementDirectionY()
	 * @see #unsetHatchDisplacementDirectionY()
	 * @see #getHatchDisplacementDirectionY()
	 * @generated
	 */
	void setHatchDisplacementDirectionY(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getHatchDisplacementDirectionY <em>Hatch Displacement Direction Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHatchDisplacementDirectionY()
	 * @see #getHatchDisplacementDirectionY()
	 * @see #setHatchDisplacementDirectionY(double)
	 * @generated
	 */
	void unsetHatchDisplacementDirectionY();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getHatchDisplacementDirectionY <em>Hatch Displacement Direction Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hatch Displacement Direction Y</em>' attribute is set.
	 * @see #unsetHatchDisplacementDirectionY()
	 * @see #getHatchDisplacementDirectionY()
	 * @see #setHatchDisplacementDirectionY(double)
	 * @generated
	 */
	boolean isSetHatchDisplacementDirectionY();

	/**
	 * Returns the value of the '<em><b>Hatch Displacement Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge des Vektors,  der die Position des Bezugspunkts der nächsten Schraffe definiert. Die ganzzahligen Vielfachen diese Vektors mit der gegebenen Länge erzeugen die Bezugspunkte des gesamten Schraffenfeldes. 
	 * 
	 * Defaultwert ist 50 (=0,50mm bei Verwendung der Defaultlängen).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hatch Displacement Offset</em>' attribute.
	 * @see #isSetHatchDisplacementOffset()
	 * @see #unsetHatchDisplacementOffset()
	 * @see #setHatchDisplacementOffset(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getHatchLinesType_HatchDisplacementOffset()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='hatchDisplacementOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	double getHatchDisplacementOffset();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getHatchDisplacementOffset <em>Hatch Displacement Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hatch Displacement Offset</em>' attribute.
	 * @see #isSetHatchDisplacementOffset()
	 * @see #unsetHatchDisplacementOffset()
	 * @see #getHatchDisplacementOffset()
	 * @generated
	 */
	void setHatchDisplacementOffset(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getHatchDisplacementOffset <em>Hatch Displacement Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHatchDisplacementOffset()
	 * @see #getHatchDisplacementOffset()
	 * @see #setHatchDisplacementOffset(double)
	 * @generated
	 */
	void unsetHatchDisplacementOffset();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType#getHatchDisplacementOffset <em>Hatch Displacement Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hatch Displacement Offset</em>' attribute is set.
	 * @see #unsetHatchDisplacementOffset()
	 * @see #getHatchDisplacementOffset()
	 * @see #setHatchDisplacementOffset(double)
	 * @generated
	 */
	boolean isSetHatchDisplacementOffset();

} // HatchLinesType
