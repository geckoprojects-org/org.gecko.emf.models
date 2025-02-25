/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package org.openmicroscopy.ome;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         The shape element contains a single specific ROI shape and links
 *         that to any channels, and a timepoint and a z-section. It also
 *         records any transform applied to the ROI shape.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.Shape#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.Shape#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.Shape#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.Shape#getFillRule <em>Fill Rule</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.Shape#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.Shape#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.Shape#getFontSizeUnit <em>Font Size Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.Shape#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.Shape#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.Shape#isLocked <em>Locked</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.Shape#getStrokeColor <em>Stroke Color</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.Shape#getStrokeDashArray <em>Stroke Dash Array</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.Shape#getStrokeWidth <em>Stroke Width</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.Shape#getStrokeWidthUnit <em>Stroke Width Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.Shape#getText <em>Text</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.Shape#getTheC <em>The C</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.Shape#getTheT <em>The T</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.Shape#getTheZ <em>The Z</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getShape()
 * @model extendedMetaData="name='Shape' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Shape extends EObject {
	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             This is a matrix used to transform the shape.
	 *             The element has 6 xsd:float attributes. If the element
	 *             is present then all 6 values must be included.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transform</em>' containment reference.
	 * @see #setTransform(AffineTransform)
	 * @see org.openmicroscopy.ome.OMEPackage#getShape_Transform()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Transform' namespace='##targetNamespace'"
	 * @generated
	 */
	AffineTransform getTransform();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.Shape#getTransform <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' containment reference.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(AffineTransform value);

	/**
	 * Returns the value of the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.AnnotationRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The AnnotationRef element is a reference to an element derived
	 *         from the CommonAnnotation element.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation Ref</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getShape_AnnotationRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnnotationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationRefType> getAnnotationRef();

	/**
	 * Returns the value of the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The color of the fill - encoded as RGBA
	 *           The value "-1" is #FFFFFFFF so solid white (it is a signed 32 bit value)
	 *           NOTE: Prior to the 2012-06 schema the default value was incorrect and produced a transparent red not solid white.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fill Color</em>' attribute.
	 * @see #isSetFillColor()
	 * @see #unsetFillColor()
	 * @see #setFillColor(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getShape_FillColor()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.Color"
	 *        extendedMetaData="kind='attribute' name='FillColor'"
	 * @generated
	 */
	int getFillColor();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.Shape#getFillColor <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Color</em>' attribute.
	 * @see #isSetFillColor()
	 * @see #unsetFillColor()
	 * @see #getFillColor()
	 * @generated
	 */
	void setFillColor(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.Shape#getFillColor <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFillColor()
	 * @see #getFillColor()
	 * @see #setFillColor(int)
	 * @generated
	 */
	void unsetFillColor();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.Shape#getFillColor <em>Fill Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fill Color</em>' attribute is set.
	 * @see #unsetFillColor()
	 * @see #getFillColor()
	 * @see #setFillColor(int)
	 * @generated
	 */
	boolean isSetFillColor();

	/**
	 * Returns the value of the '<em><b>Fill Rule</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.FillRuleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Rule</em>' attribute.
	 * @see org.openmicroscopy.ome.FillRuleType
	 * @see #isSetFillRule()
	 * @see #unsetFillRule()
	 * @see #setFillRule(FillRuleType)
	 * @see org.openmicroscopy.ome.OMEPackage#getShape_FillRule()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='FillRule'"
	 * @generated
	 */
	FillRuleType getFillRule();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.Shape#getFillRule <em>Fill Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Rule</em>' attribute.
	 * @see org.openmicroscopy.ome.FillRuleType
	 * @see #isSetFillRule()
	 * @see #unsetFillRule()
	 * @see #getFillRule()
	 * @generated
	 */
	void setFillRule(FillRuleType value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.Shape#getFillRule <em>Fill Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFillRule()
	 * @see #getFillRule()
	 * @see #setFillRule(FillRuleType)
	 * @generated
	 */
	void unsetFillRule();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.Shape#getFillRule <em>Fill Rule</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fill Rule</em>' attribute is set.
	 * @see #unsetFillRule()
	 * @see #getFillRule()
	 * @see #setFillRule(FillRuleType)
	 * @generated
	 */
	boolean isSetFillRule();

	/**
	 * Returns the value of the '<em><b>Font Family</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.FontFamilyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Family</em>' attribute.
	 * @see org.openmicroscopy.ome.FontFamilyType
	 * @see #isSetFontFamily()
	 * @see #unsetFontFamily()
	 * @see #setFontFamily(FontFamilyType)
	 * @see org.openmicroscopy.ome.OMEPackage#getShape_FontFamily()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='FontFamily'"
	 * @generated
	 */
	FontFamilyType getFontFamily();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.Shape#getFontFamily <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Family</em>' attribute.
	 * @see org.openmicroscopy.ome.FontFamilyType
	 * @see #isSetFontFamily()
	 * @see #unsetFontFamily()
	 * @see #getFontFamily()
	 * @generated
	 */
	void setFontFamily(FontFamilyType value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.Shape#getFontFamily <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontFamily()
	 * @see #getFontFamily()
	 * @see #setFontFamily(FontFamilyType)
	 * @generated
	 */
	void unsetFontFamily();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.Shape#getFontFamily <em>Font Family</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Family</em>' attribute is set.
	 * @see #unsetFontFamily()
	 * @see #getFontFamily()
	 * @see #setFontFamily(FontFamilyType)
	 * @generated
	 */
	boolean isSetFontFamily();

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Size of the font. Units are set by FontSizeUnit.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #isSetFontSize()
	 * @see #unsetFontSize()
	 * @see #setFontSize(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getShape_FontSize()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.NonNegativeInt"
	 *        extendedMetaData="kind='attribute' name='FontSize'"
	 * @generated
	 */
	int getFontSize();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.Shape#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #isSetFontSize()
	 * @see #unsetFontSize()
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.Shape#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontSize()
	 * @see #getFontSize()
	 * @see #setFontSize(int)
	 * @generated
	 */
	void unsetFontSize();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.Shape#getFontSize <em>Font Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Size</em>' attribute is set.
	 * @see #unsetFontSize()
	 * @see #getFontSize()
	 * @see #setFontSize(int)
	 * @generated
	 */
	boolean isSetFontSize();

	/**
	 * Returns the value of the '<em><b>Font Size Unit</b></em>' attribute.
	 * The default value is <code>"pt"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The units used for the font size.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Font Size Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetFontSizeUnit()
	 * @see #unsetFontSizeUnit()
	 * @see #setFontSizeUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getShape_FontSizeUnit()
	 * @model default="pt" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='FontSizeUnit'"
	 * @generated
	 */
	UnitsLength getFontSizeUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.Shape#getFontSizeUnit <em>Font Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetFontSizeUnit()
	 * @see #unsetFontSizeUnit()
	 * @see #getFontSizeUnit()
	 * @generated
	 */
	void setFontSizeUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.Shape#getFontSizeUnit <em>Font Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontSizeUnit()
	 * @see #getFontSizeUnit()
	 * @see #setFontSizeUnit(UnitsLength)
	 * @generated
	 */
	void unsetFontSizeUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.Shape#getFontSizeUnit <em>Font Size Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Size Unit</em>' attribute is set.
	 * @see #unsetFontSizeUnit()
	 * @see #getFontSizeUnit()
	 * @see #setFontSizeUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetFontSizeUnit();

	/**
	 * Returns the value of the '<em><b>Font Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.FontStyleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Style</em>' attribute.
	 * @see org.openmicroscopy.ome.FontStyleType
	 * @see #isSetFontStyle()
	 * @see #unsetFontStyle()
	 * @see #setFontStyle(FontStyleType)
	 * @see org.openmicroscopy.ome.OMEPackage#getShape_FontStyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='FontStyle'"
	 * @generated
	 */
	FontStyleType getFontStyle();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.Shape#getFontStyle <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Style</em>' attribute.
	 * @see org.openmicroscopy.ome.FontStyleType
	 * @see #isSetFontStyle()
	 * @see #unsetFontStyle()
	 * @see #getFontStyle()
	 * @generated
	 */
	void setFontStyle(FontStyleType value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.Shape#getFontStyle <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontStyle()
	 * @see #getFontStyle()
	 * @see #setFontStyle(FontStyleType)
	 * @generated
	 */
	void unsetFontStyle();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.Shape#getFontStyle <em>Font Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Style</em>' attribute is set.
	 * @see #unsetFontStyle()
	 * @see #getFontStyle()
	 * @see #setFontStyle(FontStyleType)
	 * @generated
	 */
	boolean isSetFontStyle();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getShape_ID()
	 * @model dataType="org.openmicroscopy.ome.ShapeID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.Shape#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Controls whether the shape is locked and read only,
	 *           true is locked, false is editable.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locked</em>' attribute.
	 * @see #isSetLocked()
	 * @see #unsetLocked()
	 * @see #setLocked(boolean)
	 * @see org.openmicroscopy.ome.OMEPackage#getShape_Locked()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Locked'"
	 * @generated
	 */
	boolean isLocked();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.Shape#isLocked <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked</em>' attribute.
	 * @see #isSetLocked()
	 * @see #unsetLocked()
	 * @see #isLocked()
	 * @generated
	 */
	void setLocked(boolean value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.Shape#isLocked <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocked()
	 * @see #isLocked()
	 * @see #setLocked(boolean)
	 * @generated
	 */
	void unsetLocked();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.Shape#isLocked <em>Locked</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Locked</em>' attribute is set.
	 * @see #unsetLocked()
	 * @see #isLocked()
	 * @see #setLocked(boolean)
	 * @generated
	 */
	boolean isSetLocked();

	/**
	 * Returns the value of the '<em><b>Stroke Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The color of the stroke  - encoded as RGBA
	 *           The value "-1" is #FFFFFFFF so solid white (it is a signed 32 bit value)
	 *           NOTE: Prior to the 2012-06 schema the default value was incorrect and produced a transparent red not solid white.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stroke Color</em>' attribute.
	 * @see #isSetStrokeColor()
	 * @see #unsetStrokeColor()
	 * @see #setStrokeColor(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getShape_StrokeColor()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.Color"
	 *        extendedMetaData="kind='attribute' name='StrokeColor'"
	 * @generated
	 */
	int getStrokeColor();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.Shape#getStrokeColor <em>Stroke Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Color</em>' attribute.
	 * @see #isSetStrokeColor()
	 * @see #unsetStrokeColor()
	 * @see #getStrokeColor()
	 * @generated
	 */
	void setStrokeColor(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.Shape#getStrokeColor <em>Stroke Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeColor()
	 * @see #getStrokeColor()
	 * @see #setStrokeColor(int)
	 * @generated
	 */
	void unsetStrokeColor();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.Shape#getStrokeColor <em>Stroke Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stroke Color</em>' attribute is set.
	 * @see #unsetStrokeColor()
	 * @see #getStrokeColor()
	 * @see #setStrokeColor(int)
	 * @generated
	 */
	boolean isSetStrokeColor();

	/**
	 * Returns the value of the '<em><b>Stroke Dash Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           e.g. "none", "10 20 30 10"
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stroke Dash Array</em>' attribute.
	 * @see #setStrokeDashArray(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getShape_StrokeDashArray()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='StrokeDashArray'"
	 * @generated
	 */
	String getStrokeDashArray();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.Shape#getStrokeDashArray <em>Stroke Dash Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Dash Array</em>' attribute.
	 * @see #getStrokeDashArray()
	 * @generated
	 */
	void setStrokeDashArray(String value);

	/**
	 * Returns the value of the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The width of the stroke. Units are set by StrokeWidthUnit.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stroke Width</em>' attribute.
	 * @see #isSetStrokeWidth()
	 * @see #unsetStrokeWidth()
	 * @see #setStrokeWidth(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getShape_StrokeWidth()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='StrokeWidth'"
	 * @generated
	 */
	float getStrokeWidth();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.Shape#getStrokeWidth <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Width</em>' attribute.
	 * @see #isSetStrokeWidth()
	 * @see #unsetStrokeWidth()
	 * @see #getStrokeWidth()
	 * @generated
	 */
	void setStrokeWidth(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.Shape#getStrokeWidth <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeWidth()
	 * @see #getStrokeWidth()
	 * @see #setStrokeWidth(float)
	 * @generated
	 */
	void unsetStrokeWidth();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.Shape#getStrokeWidth <em>Stroke Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stroke Width</em>' attribute is set.
	 * @see #unsetStrokeWidth()
	 * @see #getStrokeWidth()
	 * @see #setStrokeWidth(float)
	 * @generated
	 */
	boolean isSetStrokeWidth();

	/**
	 * Returns the value of the '<em><b>Stroke Width Unit</b></em>' attribute.
	 * The default value is <code>"pixel"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The units used for the stroke width.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stroke Width Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetStrokeWidthUnit()
	 * @see #unsetStrokeWidthUnit()
	 * @see #setStrokeWidthUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getShape_StrokeWidthUnit()
	 * @model default="pixel" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='StrokeWidthUnit'"
	 * @generated
	 */
	UnitsLength getStrokeWidthUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.Shape#getStrokeWidthUnit <em>Stroke Width Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Width Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetStrokeWidthUnit()
	 * @see #unsetStrokeWidthUnit()
	 * @see #getStrokeWidthUnit()
	 * @generated
	 */
	void setStrokeWidthUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.Shape#getStrokeWidthUnit <em>Stroke Width Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeWidthUnit()
	 * @see #getStrokeWidthUnit()
	 * @see #setStrokeWidthUnit(UnitsLength)
	 * @generated
	 */
	void unsetStrokeWidthUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.Shape#getStrokeWidthUnit <em>Stroke Width Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stroke Width Unit</em>' attribute is set.
	 * @see #unsetStrokeWidthUnit()
	 * @see #getStrokeWidthUnit()
	 * @see #setStrokeWidthUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetStrokeWidthUnit();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getShape_Text()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Text'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.Shape#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>The C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The channel the ROI applies to. If not specified then
	 *           the ROI applies to all the channels of the image. [units:none]
	 *           This is numbered from 0.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>The C</em>' attribute.
	 * @see #isSetTheC()
	 * @see #unsetTheC()
	 * @see #setTheC(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getShape_TheC()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.NonNegativeInt"
	 *        extendedMetaData="kind='attribute' name='TheC'"
	 * @generated
	 */
	int getTheC();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.Shape#getTheC <em>The C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The C</em>' attribute.
	 * @see #isSetTheC()
	 * @see #unsetTheC()
	 * @see #getTheC()
	 * @generated
	 */
	void setTheC(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.Shape#getTheC <em>The C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTheC()
	 * @see #getTheC()
	 * @see #setTheC(int)
	 * @generated
	 */
	void unsetTheC();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.Shape#getTheC <em>The C</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>The C</em>' attribute is set.
	 * @see #unsetTheC()
	 * @see #getTheC()
	 * @see #setTheC(int)
	 * @generated
	 */
	boolean isSetTheC();

	/**
	 * Returns the value of the '<em><b>The T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The timepoint the ROI applies to. If not specified then
	 *           the ROI applies to all the timepoints of the image. [units:none]
	 *           This is numbered from 0.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>The T</em>' attribute.
	 * @see #isSetTheT()
	 * @see #unsetTheT()
	 * @see #setTheT(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getShape_TheT()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.NonNegativeInt"
	 *        extendedMetaData="kind='attribute' name='TheT'"
	 * @generated
	 */
	int getTheT();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.Shape#getTheT <em>The T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The T</em>' attribute.
	 * @see #isSetTheT()
	 * @see #unsetTheT()
	 * @see #getTheT()
	 * @generated
	 */
	void setTheT(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.Shape#getTheT <em>The T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTheT()
	 * @see #getTheT()
	 * @see #setTheT(int)
	 * @generated
	 */
	void unsetTheT();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.Shape#getTheT <em>The T</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>The T</em>' attribute is set.
	 * @see #unsetTheT()
	 * @see #getTheT()
	 * @see #setTheT(int)
	 * @generated
	 */
	boolean isSetTheT();

	/**
	 * Returns the value of the '<em><b>The Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The z-section the ROI applies to. If not specified then
	 *           the ROI applies to all the z-sections of the image. [units:none]
	 *           This is numbered from 0.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>The Z</em>' attribute.
	 * @see #isSetTheZ()
	 * @see #unsetTheZ()
	 * @see #setTheZ(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getShape_TheZ()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.NonNegativeInt"
	 *        extendedMetaData="kind='attribute' name='TheZ'"
	 * @generated
	 */
	int getTheZ();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.Shape#getTheZ <em>The Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Z</em>' attribute.
	 * @see #isSetTheZ()
	 * @see #unsetTheZ()
	 * @see #getTheZ()
	 * @generated
	 */
	void setTheZ(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.Shape#getTheZ <em>The Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTheZ()
	 * @see #getTheZ()
	 * @see #setTheZ(int)
	 * @generated
	 */
	void unsetTheZ();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.Shape#getTheZ <em>The Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>The Z</em>' attribute is set.
	 * @see #unsetTheZ()
	 * @see #getTheZ()
	 * @see #setTheZ(int)
	 * @generated
	 */
	boolean isSetTheZ();

} // Shape
