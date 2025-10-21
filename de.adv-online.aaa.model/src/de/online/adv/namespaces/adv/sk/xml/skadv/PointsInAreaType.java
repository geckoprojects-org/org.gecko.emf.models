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
 * A representation of the model object '<em><b>Points In Area Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getHorizontalDisplacementX <em>Horizontal Displacement X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getHorizontalDisplacementY <em>Horizontal Displacement Y</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getVerticalDisplacementX <em>Vertical Displacement X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getVerticalDisplacementY <em>Vertical Displacement Y</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getOriginX <em>Origin X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getOriginY <em>Origin Y</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getPlacement <em>Placement</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPointsInAreaType()
 * @model extendedMetaData="name='PointsInAreaType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PointsInAreaType extends PlacementRuleType {
	/**
	 * Returns the value of the '<em><b>Horizontal Displacement X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X-Wert des Vektors zur Wiederholung der Punkte in horizontaler Richtung.
	 * 
	 * Die Einheit wird bestimmt durch den mapLengthFactor, Default: mm/100.
	 * 
	 * Der Defaultwert für horizontalDisplacementX ist 600.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Displacement X</em>' attribute.
	 * @see #isSetHorizontalDisplacementX()
	 * @see #unsetHorizontalDisplacementX()
	 * @see #setHorizontalDisplacementX(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPointsInAreaType_HorizontalDisplacementX()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='horizontalDisplacementX' namespace='##targetNamespace'"
	 * @generated
	 */
	double getHorizontalDisplacementX();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getHorizontalDisplacementX <em>Horizontal Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Displacement X</em>' attribute.
	 * @see #isSetHorizontalDisplacementX()
	 * @see #unsetHorizontalDisplacementX()
	 * @see #getHorizontalDisplacementX()
	 * @generated
	 */
	void setHorizontalDisplacementX(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getHorizontalDisplacementX <em>Horizontal Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHorizontalDisplacementX()
	 * @see #getHorizontalDisplacementX()
	 * @see #setHorizontalDisplacementX(double)
	 * @generated
	 */
	void unsetHorizontalDisplacementX();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getHorizontalDisplacementX <em>Horizontal Displacement X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Horizontal Displacement X</em>' attribute is set.
	 * @see #unsetHorizontalDisplacementX()
	 * @see #getHorizontalDisplacementX()
	 * @see #setHorizontalDisplacementX(double)
	 * @generated
	 */
	boolean isSetHorizontalDisplacementX();

	/**
	 * Returns the value of the '<em><b>Horizontal Displacement Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Y-Wert des Vektors zur Wiederholung der Punkte in horizontaler Richtung.
	 * 
	 * Die Einheit wird bestimmt durch den mapLengthFactor, Default: mm/100.
	 * 
	 * Der Defaultwert ist 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Displacement Y</em>' attribute.
	 * @see #isSetHorizontalDisplacementY()
	 * @see #unsetHorizontalDisplacementY()
	 * @see #setHorizontalDisplacementY(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPointsInAreaType_HorizontalDisplacementY()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='horizontalDisplacementY' namespace='##targetNamespace'"
	 * @generated
	 */
	double getHorizontalDisplacementY();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getHorizontalDisplacementY <em>Horizontal Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Displacement Y</em>' attribute.
	 * @see #isSetHorizontalDisplacementY()
	 * @see #unsetHorizontalDisplacementY()
	 * @see #getHorizontalDisplacementY()
	 * @generated
	 */
	void setHorizontalDisplacementY(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getHorizontalDisplacementY <em>Horizontal Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHorizontalDisplacementY()
	 * @see #getHorizontalDisplacementY()
	 * @see #setHorizontalDisplacementY(double)
	 * @generated
	 */
	void unsetHorizontalDisplacementY();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getHorizontalDisplacementY <em>Horizontal Displacement Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Horizontal Displacement Y</em>' attribute is set.
	 * @see #unsetHorizontalDisplacementY()
	 * @see #getHorizontalDisplacementY()
	 * @see #setHorizontalDisplacementY(double)
	 * @generated
	 */
	boolean isSetHorizontalDisplacementY();

	/**
	 * Returns the value of the '<em><b>Vertical Displacement X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X-Wert des Vektors zur Wiederholung der Punkte in vertikaler Richtung.
	 * 
	 * Die Einheit wird bestimmt durch den mapLengthFactor, Default: mm/100.
	 * 
	 * Der Defaultwert ist 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Displacement X</em>' attribute.
	 * @see #isSetVerticalDisplacementX()
	 * @see #unsetVerticalDisplacementX()
	 * @see #setVerticalDisplacementX(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPointsInAreaType_VerticalDisplacementX()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='verticalDisplacementX' namespace='##targetNamespace'"
	 * @generated
	 */
	double getVerticalDisplacementX();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getVerticalDisplacementX <em>Vertical Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Displacement X</em>' attribute.
	 * @see #isSetVerticalDisplacementX()
	 * @see #unsetVerticalDisplacementX()
	 * @see #getVerticalDisplacementX()
	 * @generated
	 */
	void setVerticalDisplacementX(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getVerticalDisplacementX <em>Vertical Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerticalDisplacementX()
	 * @see #getVerticalDisplacementX()
	 * @see #setVerticalDisplacementX(double)
	 * @generated
	 */
	void unsetVerticalDisplacementX();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getVerticalDisplacementX <em>Vertical Displacement X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vertical Displacement X</em>' attribute is set.
	 * @see #unsetVerticalDisplacementX()
	 * @see #getVerticalDisplacementX()
	 * @see #setVerticalDisplacementX(double)
	 * @generated
	 */
	boolean isSetVerticalDisplacementX();

	/**
	 * Returns the value of the '<em><b>Vertical Displacement Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Y-Wert des Vektors zur Wiederholung der Punkte in vertikaler Richtung.
	 * 
	 * Die Einheit wird bestimmt durch den mapLengthFactor, Default: mm/100.
	 * 
	 * Der Defaultwert des verticalDisplacementY ist 600.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Displacement Y</em>' attribute.
	 * @see #isSetVerticalDisplacementY()
	 * @see #unsetVerticalDisplacementY()
	 * @see #setVerticalDisplacementY(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPointsInAreaType_VerticalDisplacementY()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='verticalDisplacementY' namespace='##targetNamespace'"
	 * @generated
	 */
	double getVerticalDisplacementY();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getVerticalDisplacementY <em>Vertical Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Displacement Y</em>' attribute.
	 * @see #isSetVerticalDisplacementY()
	 * @see #unsetVerticalDisplacementY()
	 * @see #getVerticalDisplacementY()
	 * @generated
	 */
	void setVerticalDisplacementY(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getVerticalDisplacementY <em>Vertical Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerticalDisplacementY()
	 * @see #getVerticalDisplacementY()
	 * @see #setVerticalDisplacementY(double)
	 * @generated
	 */
	void unsetVerticalDisplacementY();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getVerticalDisplacementY <em>Vertical Displacement Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vertical Displacement Y</em>' attribute is set.
	 * @see #unsetVerticalDisplacementY()
	 * @see #getVerticalDisplacementY()
	 * @see #setVerticalDisplacementY(double)
	 * @generated
	 */
	boolean isSetVerticalDisplacementY();

	/**
	 * Returns the value of the '<em><b>Origin X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X-Wert des Ursprungs des Punkt-Feldes. 
	 * 
	 * Defaultwert ist noch festzulegen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin X</em>' attribute.
	 * @see #isSetOriginX()
	 * @see #unsetOriginX()
	 * @see #setOriginX(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPointsInAreaType_OriginX()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='originX' namespace='##targetNamespace'"
	 * @generated
	 */
	double getOriginX();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getOriginX <em>Origin X</em>}' attribute.
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
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getOriginX <em>Origin X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOriginX()
	 * @see #getOriginX()
	 * @see #setOriginX(double)
	 * @generated
	 */
	void unsetOriginX();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getOriginX <em>Origin X</em>}' attribute is set.
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
	 * Y-Wert des Ursprungs des Punkt-Feldes. 
	 * 
	 * Defaultwert ist noch festzulegen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin Y</em>' attribute.
	 * @see #isSetOriginY()
	 * @see #unsetOriginY()
	 * @see #setOriginY(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPointsInAreaType_OriginY()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='originY' namespace='##targetNamespace'"
	 * @generated
	 */
	double getOriginY();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getOriginY <em>Origin Y</em>}' attribute.
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
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getOriginY <em>Origin Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOriginY()
	 * @see #getOriginY()
	 * @see #setOriginY(double)
	 * @generated
	 */
	void unsetOriginY();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getOriginY <em>Origin Y</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Placement</b></em>' attribute.
	 * The literals are from the enumeration {@link de.online.adv.namespaces.adv.sk.xml.skadv.RegularityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Durch "placement" kann ein sogenanntes unregelmäßiges Muster angefordert werden. 
	 * 
	 * Über dessen Aussehen liegen keine weiteren Angaben vor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Placement</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.RegularityType
	 * @see #isSetPlacement()
	 * @see #unsetPlacement()
	 * @see #setPlacement(RegularityType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPointsInAreaType_Placement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='placement' namespace='##targetNamespace'"
	 * @generated
	 */
	RegularityType getPlacement();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getPlacement <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.RegularityType
	 * @see #isSetPlacement()
	 * @see #unsetPlacement()
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(RegularityType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getPlacement <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlacement()
	 * @see #getPlacement()
	 * @see #setPlacement(RegularityType)
	 * @generated
	 */
	void unsetPlacement();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType#getPlacement <em>Placement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Placement</em>' attribute is set.
	 * @see #unsetPlacement()
	 * @see #getPlacement()
	 * @see #setPlacement(RegularityType)
	 * @generated
	 */
	boolean isSetPlacement();

} // PointsInAreaType
